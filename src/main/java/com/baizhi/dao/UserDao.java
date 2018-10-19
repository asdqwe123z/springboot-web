package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by jia on 2018/10/17.
 */
public interface UserDao {
    public List<User> selectAll();
}
