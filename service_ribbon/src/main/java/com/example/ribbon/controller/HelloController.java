package com.example.ribbon.controller;

import com.example.ribbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloService.hello(name);
    }
}
