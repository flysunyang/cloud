package com.sun.cloud.mapper;

import com.sun.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-16 22:43
 */
@Mapper
public interface PaymentMapper {

    /**
     * 新增一个Payment
     * @param payment
     * @return
     */
    Integer insert(Payment payment);

    /**
     * 根据主键ID查询Payment
     * @param id
     * @return
     */
    Payment selectById(Integer id);
}
