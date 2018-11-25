package com.example.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mystic
 * @date: 2018/11/25 19:49
 * Description:
 */
@RestController
public class ConfigClientController {
    @Value("${foo}")
    private String foo;

    @GetMapping("/hi")
    public String hi() {
        return foo;
    }
}
