/** 
 * Project Name:mybatis-plus-example 
 * File Name:UserDomain.java 
 * Package Name:com.liu.demo.mybatis.plus.model 
 * Date:2019年6月10日上午10:32:19 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.liu.demo.mybatis.plus.model;  
/** 
 * ClassName:UserDomain <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019年6月10日 上午10:32:19 <br/> 
 * @author   lgf 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class UserDomain {
  
	private Integer userId;

	private String userName;

	private String password;

	private String phone;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
  