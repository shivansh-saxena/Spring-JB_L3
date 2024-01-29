package com.shiv.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${my.greeting: default value for properties}")
    private String valueFromProperties;
    @GetMapping("/")
    public String greeting()
    {
        return valueFromProperties;
    }
}
