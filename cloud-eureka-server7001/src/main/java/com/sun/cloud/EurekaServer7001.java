package com.sun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhaoyang
 * @description
 * @EnableEurekaServer 启用Eureka客户端
 * @create 2020-03-17 19:12
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class, args);
    }
}
