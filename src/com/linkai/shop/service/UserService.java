package com.linkai.shop.service;

import com.linkai.shop.pojo.User;

//用户
public interface UserService {

	// 注册
	public void register(User user);

	// 登录
	public User login(User user) throws Exception;

}
