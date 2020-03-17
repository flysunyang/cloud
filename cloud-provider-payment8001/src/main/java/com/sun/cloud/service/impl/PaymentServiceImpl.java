package com.sun.cloud.service.impl;

import com.sun.cloud.mapper.PaymentMapper;
import com.sun.cloud.pojo.Payment;
import com.sun.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-16 22:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public Integer add(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getById(Integer id) {
        return paymentMapper.selectById(id);
    }
}
