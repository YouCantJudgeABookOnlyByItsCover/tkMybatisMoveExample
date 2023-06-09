package com.example.demo.service;

import java.util.List;

import com.example.demo.dal.entity.User;


public interface UserService {
    /**
     * 获取所有
     *
     * @return
     */
    List<User> getAll();

    /**
     * 移动节点顺序
     *
     * @param movingId 移动的 id
     * @param targetId 目标 id
     * @param isBefore 目标节点的上方true or 下面false
     * @return
     */
    int move(Long movingId, Long targetId, boolean isBefore);
}

//-----------------

