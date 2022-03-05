package com.jyd.microservice.limitsservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Configuration
{
    @Value("${limit-service.min}")
    private int min;
    @Value("${limit-service.max}")
    private int max;

}
