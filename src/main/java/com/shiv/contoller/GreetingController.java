package com.shiv.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @Value("${my.greeting: default value for properties}")
    private String valueFromProperties;
    @Value("some static string")
    private String staticString;
    @Value("${my.list}")
    private List<String> myList;
    @Value("#{${my.keyValue}}")
    private Map<String,String> keyValue;
    @GetMapping("/")
    public String greeting()
    {
        return valueFromProperties+"\n  "+myList+staticString+"\n  "+keyValue;
    }
}
