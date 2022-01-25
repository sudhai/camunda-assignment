package com.camundaAssignment.test.service;

import com.camundaAssignment.test.models.CreditCardProducts;
import com.camundaAssignment.test.models.CreditCardRequest;

import java.util.List;

public interface CardService {
    List<CreditCardProducts> getCardTypes();

    void requestCard(CreditCardRequest request);
}
