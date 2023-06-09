package com.example.demo.dal.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;


import com.example.demo.tk.annotation.Seq;

import lombok.Data;
import tk.mybatis.mapper.annotation.Order;

@Data
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    //这里用到了顺序号注解
    @Seq
    @Order
    private Integer sequence;
    private String name;
    private String py;
    //省略setter和getter方法
}

