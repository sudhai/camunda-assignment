package com.creditCardRequestService.test.delegates;

import com.creditCardRequestService.test.models.CreditCardRequest;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component("registerProduct")
public class RegisterProductDelegate implements JavaDelegate {

    @Value("${register.product.api}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside register product delegate success");

        CreditCardRequest request = (CreditCardRequest) delegateExecution.getVariable("creditCardRequest");
        log.info("register product for request: "+request);
        log.info("register product api url: "+url);
        String response = restTemplate.postForObject(url,request, String.class);

        log.info("Response from Register product api: "+response);
    }
}
