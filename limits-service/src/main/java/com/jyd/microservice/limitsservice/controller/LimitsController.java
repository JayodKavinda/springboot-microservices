package com.jyd.microservice.limitsservice.controller;


import com.jyd.microservice.limitsservice.config.Configuration;
import com.jyd.microservice.limitsservice.models.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMin(),configuration.getMax());
    }
}
