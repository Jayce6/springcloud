package com.zwh.springcloud.service.impl;

import com.zwh.springcloud.dao.DeptDao;
import com.zwh.springcloud.entities.Dept;
import com.zwh.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther Zwh
 * @create 2019/12/23-16:28
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
