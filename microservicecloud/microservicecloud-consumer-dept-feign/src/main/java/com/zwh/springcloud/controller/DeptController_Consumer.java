package com.zwh.springcloud.controller;

import com.zwh.springcloud.entities.Dept;
import com.zwh.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @auther Zwh
 * @create 2019/12/23-17:10
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptclientService;


    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){

        return deptclientService.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return deptclientService.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List list(){
        return deptclientService.list();
    }


}
