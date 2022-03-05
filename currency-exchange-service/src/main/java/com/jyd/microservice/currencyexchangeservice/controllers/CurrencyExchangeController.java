package com.jyd.microservice.currencyexchangeservice.controllers;

import com.jyd.microservice.currencyexchangeservice.models.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveValue(@PathVariable String from, @PathVariable String to){
        return new CurrencyExchange(1000L,from, to, BigDecimal.valueOf(200));
    }
}