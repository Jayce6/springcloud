package com.zwh.springcloud;

import com.zwh.myRule.mySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 *   ribbon+RestTemplate
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = mySelfRule.class)
//自定义配置类不能放在@ComponentScan所扫描的包下，否则自定义的配置类就会被所有的Ribbon客户端所共享
//也就是说我们达不到特殊化定制的目的

public class DeptConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
