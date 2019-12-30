package com.zwh.springcloud.service;

import com.zwh.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther Zwh
 * @create 2019/12/25-9:51
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("获取不到该："+id+",没有对应的信息,null--@@HystrixCommand")
                        .setDb_source("no this data in database in MYSQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
