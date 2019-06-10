package com.liu.demo.mybatis.plus.model;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName(value="users")
public class Users {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}