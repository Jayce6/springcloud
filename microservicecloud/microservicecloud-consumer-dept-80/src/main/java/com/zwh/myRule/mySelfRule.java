package com.zwh.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther Zwh
 * @create 2019/12/24-15:26
 */
@Configuration
public class mySelfRule {

    @Bean
    public IRule myRule(){
        return new randomRule();
    }
}
