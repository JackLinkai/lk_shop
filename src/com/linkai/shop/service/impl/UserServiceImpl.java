package com.linkai.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkai.shop.mapper.UserMapper;
import com.linkai.shop.pojo.User;
import com.linkai.shop.pojo.UserExample;
import com.linkai.shop.pojo.UserExample.Criteria;
import com.linkai.shop.service.UserService;

//用户管理模块
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	// 注册
	@Override
	public void register(User user) {
		userMapper.insertSelective(user);

	}

	// 登录
	@Override
	public User login(User user) throws Exception{
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		List<User> list = userMapper.selectByExample(example);
		return list.get(0);

	}

}
