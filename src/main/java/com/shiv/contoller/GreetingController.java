package com.shiv.contoller;

import com.shiv.settings.MySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RefreshScope
public class GreetingController {

    @Value("${my.greeting: default value for properties}")
    private String valueFromProperties;
    @Value("some static string")
    private String staticString;
    @Value("${my.list}")
    private List<String> myList;
    @Value("#{${my.keyValue}}")
    private Map<String,String> keyValue;
    @Autowired
    private MySettings mySettings;
    @Autowired
    private Environment environment;
    @GetMapping("/")
    public String greeting()
    {
        return valueFromProperties+"\n  "+myList+staticString+"\n  "+keyValue+"\n" +
                "  Values from mySettings using ConfigurationProperties; "+mySettings;
    }

    @GetMapping("/env")
    public String envDetails()
    {
        return environment.toString();
    }

}
