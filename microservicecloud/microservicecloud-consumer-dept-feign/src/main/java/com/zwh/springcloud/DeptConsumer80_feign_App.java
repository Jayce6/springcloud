package com.zwh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 通过接口的方法调用rest服务
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.zwh.springcloud")
public class DeptConsumer80_feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_feign_App.class,args);
    }
}
