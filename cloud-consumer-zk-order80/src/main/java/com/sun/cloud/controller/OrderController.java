package com.sun.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-18 13:55
 */
@RestController
@RequestMapping("/consumer/payment")
public class OrderController {

    private static final String APPLICATION_NAME = "http://cloud-payment-service";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/zk")
    public String zk() {
        return restTemplate.getForObject(APPLICATION_NAME + "/payment/zk", String.class);
    }
}
