package com.xinlei.service.impl;

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
}
