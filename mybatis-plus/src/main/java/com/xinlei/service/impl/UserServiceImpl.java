package com.xinlei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xinlei.mapper.UserMapper;
import com.xinlei.pojo.User;
import com.xinlei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> list = userMapper.selectList(null);
        return list;
    }

    @Override
    public User getUserByName(String name) {
        QueryWrapper<User> ew = new QueryWrapper<>();
        ew.eq("username", name);
        return userMapper.selectOne(ew);
    }

    @Override
    public User getUserById(int id) {
        QueryWrapper<User> ew = new QueryWrapper<>();
        ew.eq("id", id);
        return userMapper.selectOne(ew);
    }
}
