package com.jyd.microservice.currencyexchangeservice.controllers;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

@RestController
public class CircuitBreakerController {

    private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/api")
    //@Retry(name = "sample-api" ,fallbackMethod = "hardcodedResponse")
    @CircuitBreaker(name = "default" ,fallbackMethod = "hardcodedResponse")
    @RateLimiter(name= "default")
    //@Bulkhead(name ="sample-api")
    public String api(){
        logger.info("Sample API called!");
        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http:/localhoast:8080/dummy", String.class);
        return forEntity.getBody();
    }

    public String hardcodedResponse(Exception ex){
        return "fallback-response";
    }
}
