package com.zwh.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zwh.springcloud.entities.Dept;
import com.zwh.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther Zwh
 * @create 2019/12/23-16:32
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id")Long id){

        Dept dept = deptService.findById(id);
        if (dept==null) {
            throw new RuntimeException("该Id"+id+"没有对应的信息");
        }
        return dept;
    }
    public Dept processHystrix_Get(@PathVariable("id")Long id){
        return new Dept().setDeptno(id).setDname("获取不到该："+id+",没有对应的信息,null--@@HystrixCommand")
                .setDb_source("no this data in database in MYSQL");

    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.findAll();
    }

}
