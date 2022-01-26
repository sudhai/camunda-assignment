package com.creditCardProcess.test.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
    private String name;
    private long cardNumber;
    private String expiryDate;
    private CardType cardType;
    private double balance;
}
