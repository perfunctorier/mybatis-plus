package com.xinlei.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("sys_roles")
public class Role {
    @TableId(value = "id", type = IdType.AUTO)
    private int rolecode;
    private String rolename;
    private String remark;
    private String codeUrl;

    @Override
    public String toString() {
        return "Role{" +
                "rolecode=" + rolecode +
                ", rolename='" + rolename + '\'' +
                ", remark='" + remark + '\'' +
                ", codeUrl='" + codeUrl + '\'' +
                '}';
    }

    public int getRolecode() {
        return rolecode;
    }

    public void setRolecode(int rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }
}
