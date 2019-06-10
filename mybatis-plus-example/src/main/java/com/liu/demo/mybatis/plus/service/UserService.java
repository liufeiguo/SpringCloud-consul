package com.liu.demo.mybatis.plus.service;
import com.github.pagehelper.PageInfo;
import com.liu.demo.mybatis.plus.model.UserDomain;

public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
