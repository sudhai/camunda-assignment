package com.creditCardRequestService.test.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardRequest {

    private String firstName;
    private String lastName;
    private int age;
    private CardType cardType;
    private String emailId;
}
