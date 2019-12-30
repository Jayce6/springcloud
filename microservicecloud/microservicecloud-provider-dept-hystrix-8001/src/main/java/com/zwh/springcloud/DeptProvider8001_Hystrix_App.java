package com.zwh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @auther Zwh
 * @create 2019/12/23-16:38
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进Eureka服务中
@EnableDiscoveryClient//服务发现
@EnableHystrix//对Hystrix熔断机制的支持
public class DeptProvider8001_Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
    }
}
