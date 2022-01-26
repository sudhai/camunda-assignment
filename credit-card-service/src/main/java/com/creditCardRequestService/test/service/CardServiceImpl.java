package com.creditCardRequestService.test.service;

import com.creditCardRequestService.test.models.CardType;
import com.creditCardRequestService.test.models.CreditCardProducts;
import com.creditCardRequestService.test.models.CreditCardRequest;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

        Map<String,Object> variables = new HashMap<>();
        variables.put("creditCardRequest",request);
        String processInstanceId = runtimeService.startProcessInstanceByKey("Process_0kc628f",variables).getProcessInstanceId();

        log.info("started credit card request process with instance id: "+processInstanceId);
    }
}
