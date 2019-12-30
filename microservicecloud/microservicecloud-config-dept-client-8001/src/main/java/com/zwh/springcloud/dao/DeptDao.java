package com.zwh.springcloud.dao;

import com.zwh.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther Zwh
 * @create 2019/12/23-16:13
 */
@Mapper
public interface   DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
