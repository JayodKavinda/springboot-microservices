package com.jyd.microservice.limitsservice.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Limits {

    private int maximum;
    private int minimum;


}
