package com.camundaAssignment.test.delegates;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Slf4j
@Component("createProduct")
public class CreateCardDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Inside create card delegate success");
        log.info("Create card for request: "+delegateExecution.getVariable("creditCardRequest"));
    }
}
