package com.example.demo.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dal.entity.User;
import com.example.demo.dal.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.tk.constantValues.Direction;
import com.example.demo.tk.utils.MoveMapperUtil;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    public int move(Long movingId, Long targetId, boolean isBefore) {
        return MoveMapperUtil.move(userMapper, movingId, targetId,
                isBefore ? Direction.BEFORE : Direction.AFTER, Collections.emptyMap());
    }



}
