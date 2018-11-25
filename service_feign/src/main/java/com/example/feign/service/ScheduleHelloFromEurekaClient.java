package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = ScheduleHelloFromEurekaClientHystrix.class)
public interface ScheduleHelloFromEurekaClient {
    /**
     * use client one to say hi
     * @param name name
     * @return json
     */
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
