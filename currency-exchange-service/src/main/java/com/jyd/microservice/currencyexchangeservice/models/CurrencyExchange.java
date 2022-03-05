package com.jyd.microservice.currencyexchangeservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // need for JPA
public class CurrencyExchange {

    private Long id;
    private String to;
    private String form;
    private BigDecimal conversionMultiple;
}
