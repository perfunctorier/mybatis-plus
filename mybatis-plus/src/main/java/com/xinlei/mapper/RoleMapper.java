package com.xinlei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xinlei.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RoleMapper extends BaseMapper<Role> {
}
