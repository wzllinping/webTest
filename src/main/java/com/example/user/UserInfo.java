package com.example.user;

import java.io.Serializable;

public class UserInfo implements Serializable{

    // 表字段 id（int）
    private Integer id;

    // 用户名称
    private String name;

    // 地址
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserInfo(){}

    public UserInfo(String name) {
        this.name = name;
    }

    public UserInfo(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


}
