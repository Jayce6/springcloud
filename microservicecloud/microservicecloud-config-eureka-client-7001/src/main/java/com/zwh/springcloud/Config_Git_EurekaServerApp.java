package com.zwh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther Zwh
 * @create 2019/12/23-17:55
 */
@SpringBootApplication
@EnableEurekaServer //EurekaServer服务器端启动类，接受其他微服务注册进来
public class Config_Git_EurekaServerApp {
    public static void main(String[] args) {

        SpringApplication.run(Config_Git_EurekaServerApp.class,args);
    }
}
