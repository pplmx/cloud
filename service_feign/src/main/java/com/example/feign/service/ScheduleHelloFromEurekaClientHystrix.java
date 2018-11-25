package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class ScheduleHelloFromEurekaClientHystrix implements ScheduleHelloFromEurekaClient {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry, " + name + ", the Circuit Breaker occurred by Hystrix.";
    }
}
