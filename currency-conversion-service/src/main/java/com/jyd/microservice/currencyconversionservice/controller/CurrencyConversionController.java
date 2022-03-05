package com.jyd.microservice.currencyconversionservice.controller;


import com.jyd.microservice.currencyconversionservice.models.CurrencyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/form/{from}/to/{to}/quantity/{q}")
    public CurrencyConversion calculateConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal q){

        HashMap<String, String> uriVariables =new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        ResponseEntity<CurrencyConversion> resEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);

        CurrencyConversion currencyConversion = resEntity.getBody();

        return new CurrencyConversion(currencyConversion.getId(),from, to, q, currencyConversion.getConversionMultiple(), q.multiply(currencyConversion.getConversionMultiple()),currencyConversion.getEnvironment());
    }
}
