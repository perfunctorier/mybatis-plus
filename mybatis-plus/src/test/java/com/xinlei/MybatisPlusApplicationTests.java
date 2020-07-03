package com.xinlei;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xinlei.mapper.UserMapper;
import com.xinlei.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    /*@Autowired
    UserMapper userMapper;*/

    @Test
    void contextLoads() {
       /* QueryWrapper<User> ew = new QueryWrapper<>();
        ew.eq("id", 116);
        ew.in("id",1,2,3,4,5);
        //ew.like("username", "g");
        List<User> list = userMapper.selectList(ew);
        list.forEach(System.out::println);
        userMapper.delete(ew);
        User user = userMapper.selectOne(ew);
        System.out.println(user.getUsername() + "---" + user.getPassword());*/
        /*User user = new User();
        user.setUsername("xinlei");
        user.setPassword("123");
        user.setRolecode(1);
        user.setIsdel(0);
        user.setSex("男");
        int i = userMapper.update(user, ew);
        System.out.println(i);*/
    }

}
