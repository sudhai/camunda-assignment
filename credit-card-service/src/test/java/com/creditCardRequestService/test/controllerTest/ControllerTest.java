package com.creditCardRequestService.test.controllerTest;

import com.creditCardRequestService.test.controller.CardController;
import com.creditCardRequestService.test.models.CardType;
import com.creditCardRequestService.test.models.CreditCardProducts;
import com.creditCardRequestService.test.models.CreditCardRequest;
import com.creditCardRequestService.test.service.CardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    @InjectMocks
    private CardController controller;

    @Mock
    private CardService service;

    @Test
    public void testGetCardTypes(){
        List<CreditCardProducts> products = new ArrayList<>();
        products.add(new CreditCardProducts(CardType.BRONZE.name(),CardType.BRONZE.getFee(), CardType.BRONZE.getCreditLimit()));
        when(service.getCardTypes()).thenReturn(products);
        ResponseEntity<List<CreditCardProducts>> response = controller.getCreditCards();

        verify(service).getCardTypes();
        assertEquals(products,response.getBody());
    }
    @Test
    public void testRequestCard(){

        when(service.requestCard(new CreditCardRequest("sa","na",CardType.BRONZE))).thenReturn(null);
        ResponseEntity<String> response = controller.requestCard(new CreditCardRequest("sa","na",CardType.BRONZE));

        verify(service).requestCard(new CreditCardRequest("sa","na",CardType.BRONZE));
        assertEquals("Not Requested",response.getBody());
    }
}
