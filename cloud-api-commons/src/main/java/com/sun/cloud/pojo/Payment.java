package com.sun.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhaoyang
 * @description
 * @create 2020-03-16 22:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    
    private Integer id;

    private String serial;
    
}
