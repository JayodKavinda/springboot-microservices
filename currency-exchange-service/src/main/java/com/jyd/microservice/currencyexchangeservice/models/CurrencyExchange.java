package com.jyd.microservice.currencyexchangeservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor // need for JPA
@Entity
public class CurrencyExchange {

    @Id
    private Long id;
    @Column(name = "currency_to")
    private String to;

    @Column(name = "currency_from")
    private String from;
    private BigDecimal conversionMultiple;
    private String environment;

    public CurrencyExchange(Long id, String to, String from, BigDecimal conversionMultiple) {
        this.id = id;
        this.to = to;
        this.from = from;
        this.conversionMultiple = conversionMultiple;
    }
}
