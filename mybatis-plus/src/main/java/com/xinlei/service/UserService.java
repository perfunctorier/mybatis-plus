package com.xinlei.service;

import com.xinlei.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserService {
    public List<User> getUserList();
}
