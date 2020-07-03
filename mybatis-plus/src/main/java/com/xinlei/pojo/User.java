package com.xinlei.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("sys_users")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String username;
    private String password;
    private int rolecode;
    private int isdel;
    private String sex;

    public User() {
    }

    public User(int id, String username, String password, int rolecode, int isdel, String sex) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rolecode = rolecode;
        this.isdel = isdel;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRolecode() {
        return rolecode;
    }

    public void setRolecode(int rolecode) {
        this.rolecode = rolecode;
    }

    public int getIsdel() {
        return isdel;
    }

    public void setIsdel(int isdel) {
        this.isdel = isdel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
