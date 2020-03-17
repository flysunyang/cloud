package com.sun.cloud.controller;

import com.sun.cloud.pojo.CommonResult;
import com.sun.cloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-17 15:41
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001/";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult add(Payment payment) {
        log.info("消费端新增订单");
        return restTemplate.postForObject(PAYMENT_URL + "payment/add", payment, CommonResult.class);
    }

    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable("id") Integer id) {
        log.info("消费端查询订单");
        return restTemplate.getForObject(PAYMENT_URL + "payment/get/" + id, CommonResult.class);
    }
}
