package com.shiv.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("my")
public class MySettings {
    private String greeting;
    private List<String> list;
    private String keyValue;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    @Override
    public String toString() {
        return "MySettings{" +
                "greeting='" + greeting + '\'' +
                ", list='" + list + '\'' +
                ", keyValue='" + keyValue + '\'' +
                '}';
    }
}
