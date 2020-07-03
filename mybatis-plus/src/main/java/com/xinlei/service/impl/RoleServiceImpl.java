package com.xinlei.service.impl;

import com.xinlei.mapper.RoleMapper;
import com.xinlei.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

}
