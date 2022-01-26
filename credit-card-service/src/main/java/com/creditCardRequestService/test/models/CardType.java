package com.creditCardRequestService.test.models;

import lombok.Getter;

@Getter
public enum CardType {
    BRONZE(10,2000),
    GOLD(20,3000),
    PLATINUM(30,5000);

    private final int fee;
    private final int creditLimit;

    CardType(int fee,int creditLimit){
        this.fee = fee;
        this.creditLimit = creditLimit;
    }
}
