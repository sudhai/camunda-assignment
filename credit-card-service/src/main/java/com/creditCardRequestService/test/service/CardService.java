package com.creditCardRequestService.test.service;

import com.creditCardRequestService.test.models.CreditCardProducts;
import com.creditCardRequestService.test.models.CreditCardRequest;

import java.util.List;

public interface CardService {
    List<CreditCardProducts> getCardTypes();

    String requestCard(CreditCardRequest request);
}
