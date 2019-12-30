package com.zwh.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @auther Zwh
 * @create 2019/12/23-11:05
 */
@AllArgsConstructor
@NoArgsConstructor
@Data //set和get方法
@Accessors(chain = true) //链式调用风格
public class Dept implements Serializable {
    private Long deptno;//主键
    private String  dname;  //部门名称
    private  String db_source;  //来自哪个数据库


}
