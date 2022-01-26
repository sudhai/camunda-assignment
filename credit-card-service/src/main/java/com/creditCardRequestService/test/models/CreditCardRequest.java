package com.creditCardRequestService.test.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardRequest implements Serializable {

    private String firstName;
    private String lastName;
    private CardType cardType;

    @Override
    public String toString() {
        return "CreditCardRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardType=" + cardType +
                '}';
    }
}
