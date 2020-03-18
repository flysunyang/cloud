package com.sun.cloud.controller;

import com.sun.cloud.pojo.CommonResult;
import com.sun.cloud.pojo.Payment;
import com.sun.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-16 22:51
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    String serverPort;

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getById(id);
        log.info("查询结果：" + payment);
        if(payment != null) {
            return new CommonResult(200, "查询成功, serverPort: " + serverPort, payment);
        } else {
            return new CommonResult(400, "查询失败，id：" + id + "无数据");
        }
    }

    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment) {
        Integer result = paymentService.add(payment);
        log.info("插入结果：" + result);
        if(result > 0) {
            return new CommonResult(200, "插入成功");
        } else {
            return new CommonResult(400, "插入失败");
        }
    }
}
