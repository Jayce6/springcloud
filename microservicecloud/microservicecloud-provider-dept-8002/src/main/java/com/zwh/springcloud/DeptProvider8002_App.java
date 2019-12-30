package com.zwh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther Zwh
 * @create 2019/12/23-16:38
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进Eureka服务中
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
