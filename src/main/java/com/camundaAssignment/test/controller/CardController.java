package com.camundaAssignment.test.controller;

import com.camundaAssignment.test.models.CreditCardProducts;
import com.camundaAssignment.test.models.CreditCardRequest;
import com.camundaAssignment.test.service.CardService;
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

        service.requestCard(request);
        return null;
    }
}
