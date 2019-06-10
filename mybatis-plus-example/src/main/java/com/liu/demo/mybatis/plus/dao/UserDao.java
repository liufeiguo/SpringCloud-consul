/** 
 * Project Name:mybatis-plus-example 
 * File Name:UserDao.java 
 * Package Name:com.liu.demo.mybatis.plus.dao 
 * Date:2019年6月10日上午10:31:35 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/

package com.liu.demo.mybatis.plus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liu.demo.mybatis.plus.model.UserDomain;

/**
 * ClassName:UserDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2019年6月10日 上午10:31:35 <br/>
 * 
 * @author lgf
 * @version
 * @since JDK 1.7
 * @see
 */
//@Mapper
public interface UserDao {

	int insert(UserDomain record);

	List<UserDomain> selectUsers();

}
