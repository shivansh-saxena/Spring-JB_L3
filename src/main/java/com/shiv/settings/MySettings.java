package com.shiv.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("my")
public class MySettings {
    private String greeting;
    private String list;
    private String keyValue;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
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
