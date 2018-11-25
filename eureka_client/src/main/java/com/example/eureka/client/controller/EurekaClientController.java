package com.example.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHello(@RequestParam(value = "name", defaultValue = "mystic") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
