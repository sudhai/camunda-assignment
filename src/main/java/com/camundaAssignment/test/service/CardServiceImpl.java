package com.camundaAssignment.test.service;

import com.camundaAssignment.test.models.CardType;
import com.camundaAssignment.test.models.CreditCardProducts;
import com.camundaAssignment.test.models.CreditCardRequest;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@Slf4j
@Service
public class CardServiceImpl implements CardService{

    @Autowired
    RuntimeService runtimeService;

    @Override
    public List<CreditCardProducts> getCardTypes() {
        log.info("Inside get card types service method");

        List<CreditCardProducts> cardProducts =  new ArrayList<>();
        EnumSet.allOf(CardType.class).stream().forEach(x -> {
            CreditCardProducts product = new CreditCardProducts(x.name(),x.getFee(),x.getCreditLimit());
            cardProducts.add(product);
        });
        log.info("get card types service ended");
        return cardProducts;
    }

    @Override
    public void requestCard(CreditCardRequest request) {
        log.info("Inside request card service method");

        String processInstanceId = runtimeService.startProcessInstanceByKey("Process_0kc628f").getProcessInstanceId();

        log.info("started credit card request process with instance id: "+processInstanceId);
    }
}
