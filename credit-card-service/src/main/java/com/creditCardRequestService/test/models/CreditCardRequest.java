package com.creditCardRequestService.test.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardRequest request = (CreditCardRequest) o;
        return Objects.equals(firstName, request.firstName) && Objects.equals(lastName, request.lastName) && cardType == request.cardType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, cardType);
    }
}
