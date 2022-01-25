package com.camundaAssignment.test.service;

import com.camundaAssignment.test.models.CardType;
import com.camundaAssignment.test.models.CreditCardProducts;
import com.camundaAssignment.test.models.CreditCardRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    
    @Override
    public List<CreditCardProducts> getCardTypes() {

        List<CreditCardProducts> cardProducts =  new ArrayList<>();
        EnumSet.allOf(CardType.class).stream().forEach(x -> {
            CreditCardProducts product = new CreditCardProducts(x.name(),x.getFee(),x.getCreditLimit());
            cardProducts.add(product);
        });
        return cardProducts;
    }

    @Override
    public void requestCard(CreditCardRequest request) {


    }
}
