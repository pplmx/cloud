package com.example.feign.controller;

import com.example.feign.service.ScheduleHelloFromEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private ScheduleHelloFromEurekaClient scheduleHello;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return scheduleHello.sayHiFromClientOne(name);
    }
}
