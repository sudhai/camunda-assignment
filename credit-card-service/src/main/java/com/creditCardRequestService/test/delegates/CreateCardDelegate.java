package com.creditCardRequestService.test.delegates;

import com.creditCardRequestService.test.models.CreditCardRequest;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component("createProduct")
public class CreateCardDelegate implements JavaDelegate {

    @Value("${create.card.api}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside create card delegate success");

        CreditCardRequest request = (CreditCardRequest) delegateExecution.getVariable("creditCardRequest");
        log.info("create card for request: "+request);
        log.info("create card api url: "+url);
        JsonNode response = restTemplate.postForObject(url,request, JsonNode.class);

        if(response!=null)
        log.info("Response from create card api: "+response.toString());
        else
            log.info("response is null");

    }
}
