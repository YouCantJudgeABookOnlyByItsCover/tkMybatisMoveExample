package com.example.demo.dal.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.dal.entity.User;
import com.example.demo.tk.mapper.MoveMapper;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User>, MoveMapper<User> {

}