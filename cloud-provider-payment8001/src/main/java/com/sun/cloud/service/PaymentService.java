package com.sun.cloud.service;

import com.sun.cloud.pojo.Payment;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-16 22:45
 */
public interface PaymentService {

    Integer add(Payment payment);

    Payment getById(Integer id);
}
