package com.zwh.springcloud.service;

import com.zwh.springcloud.entities.Dept;

import java.util.List;

/**
 * @auther Zwh
 * @create 2019/12/23-16:27
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
