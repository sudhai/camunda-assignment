package com.camundaAssignment.test.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardProducts {

    private String cardType;
    private int annualFee;
    private int creditLimit;
}
