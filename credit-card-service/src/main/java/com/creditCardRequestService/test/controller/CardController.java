package com.creditCardRequestService.test.controller;

import com.creditCardRequestService.test.models.CreditCardProducts;
import com.creditCardRequestService.test.models.CreditCardRequest;
import com.creditCardRequestService.test.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    CardService service;

    @GetMapping
    public ResponseEntity<List<CreditCardProducts>> getCreditCards(){
        return new ResponseEntity<>( service.getCardTypes(), HttpStatus.OK);
    }

    @PostMapping("/requestCard")
    public ResponseEntity<String> requestCard(@RequestBody CreditCardRequest request){

        return new ResponseEntity<>(service.requestCard(request) != null ? "Requested" : "Not Requested",HttpStatus.OK);
    }
}
