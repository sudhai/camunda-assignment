package com.creditCardProcess.test.controller;

import com.creditCardProcess.test.models.CreditCard;
import com.creditCardProcess.test.models.CreditCardRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardProcessController {

    @PostMapping("/register")
    public ResponseEntity<String> registerProduct(@RequestBody CreditCardRequest request){
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CreditCard> createCard(@RequestBody CreditCardRequest request){
        long cardNo = (long) (Math.random() * 10000000000000000L);
        CreditCard card = new CreditCard(request.getFirstName()+request.getLastName(),cardNo,"02/25",request.getCardType(),request.getCardType().getCreditLimit());
        return new ResponseEntity<>(card, HttpStatus.OK);
    }
}
