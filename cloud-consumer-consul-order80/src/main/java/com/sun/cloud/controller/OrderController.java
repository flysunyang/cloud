package com.sun.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-18 19:46
 */
@RestController
@RequestMapping("/consumer/payment")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    private static final String APPLICATION_NAME = "http://cloud-payment-service";

    @GetMapping("/consul")
    public String consul() {
        return restTemplate.getForObject(APPLICATION_NAME + "/payment/consul", String.class);
    }
}
