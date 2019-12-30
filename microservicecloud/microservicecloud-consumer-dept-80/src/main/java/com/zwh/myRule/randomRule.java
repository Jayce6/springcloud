package com.zwh.myRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @auther Zwh
 * @create 2019/12/24-16:56
 */
public class randomRule extends AbstractLoadBalancerRule {
    public randomRule() {
        super();
    }

    private int total=0;
    private int idx=0;

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }
/*
                int index = this.chooseRandomInt(serverCount);
                server = (Server)upList.get(index);*/
            if(total<5){
                total++;
                server = (Server)upList.get(idx);
            }else{
                total=0;
                idx=(idx+1)%serverCount;
                server = (Server)upList.get(idx);
            }
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
