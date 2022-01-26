package com.creditCardProcess.test.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreditCardRequest {

    private String firstName;
    private String lastName;
    private CardType cardType;
}
