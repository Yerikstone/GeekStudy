package com.example.week7shardingsphere.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;

    private String userName;

    private String userPwd;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

}
