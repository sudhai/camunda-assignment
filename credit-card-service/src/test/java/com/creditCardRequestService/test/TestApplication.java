package com.creditCardRequestService.test;

import com.creditCardRequestService.test.models.CardType;
import com.creditCardRequestService.test.models.CreditCardRequest;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TestApplication {

	@Rule
	public ProcessEngineRule processEngineRule = new ProcessEngineRule();

	@Test
	@Deployment(resources = "credit_card_request_process.bpmn")
	public void testHappyPath(){
		ProcessInstance instance = processEngineRule.getRuntimeService()
				.startProcessInstanceByKey("Process_0kc628f",
						Variables.putValue("creditCardRequest",new CreditCardRequest("as","sa", CardType.BRONZE)));

		assertThat(instance.isEnded());
	}

}
