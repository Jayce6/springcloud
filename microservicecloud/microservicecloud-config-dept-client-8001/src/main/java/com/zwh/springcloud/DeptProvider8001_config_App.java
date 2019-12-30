package com.zwh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther Zwh
 * @create 2019/12/23-16:38
 */
@EnableEurekaClient //本服务启动后会自动注册进Eureka服务中
@SpringBootApplication
public class DeptProvider8001_config_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_config_App.class,args);
    }
}
