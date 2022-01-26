package com.creditCardProcess.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class CreditCardProcessController {

    @PostMapping
    public ResponseEntity<String> registerProduct(){
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
