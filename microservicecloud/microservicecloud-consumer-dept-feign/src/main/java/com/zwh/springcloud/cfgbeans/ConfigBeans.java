package com.zwh.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther Zwh
 * @create 2019/12/23-17:06
 */
@Configuration
public class ConfigBeans {

    @Bean
    @LoadBalanced//spring cloud ribbon 是基于Netflix Ribbon实现的一套客户端的  负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

   // @Bean
    public IRule myRule(){
        //  return new RoundRobinRule();  轮询
        //  return new RandomRule();   随机
        //  return new AvailabilityFilteringRule();  先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，还有并发超过阈值的服务，对剩余的服务进行轮询
        //  return new WeightedResponseTimeRule(); 根据平均响应时间计算所有服务的权重，响应越快权重越大，被选中的概率越大。
        //                                         在刚启动时如果统计信息不足，会先进行轮询，等统计信息够用，切换策略。
        //  return new RetryRule(); 先进行轮询,获取服务失败，会在指定的时间进行进行重试，获取可用的服务。
        //  return new BestAvailableRule(); 会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
        //  return new ZoneAvoidanceRule(); 默认规则，复合判断server所在区域的性能和server的可用性选择服务器
        return new RandomRule();
    }

}
