package com.linkai.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.linkai.shop.pojo.User;
import com.linkai.shop.service.UserService;
import com.linkai.shop.utils.CookieUtil;

//用户管理controller
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// 注册
	@RequestMapping("/regist")
	public String regist(@RequestBody User user) {
		try {
			userService.register(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failed";
		}
		return "OK";
	}

	// 登录
	@RequestMapping("/login")
	public String login(@RequestBody User user, HttpServletRequest request, HttpServletResponse response) {
		try {
			User user2 = userService.login(user);
			String jsonString = JSONObject.toJSONString(user2);
			CookieUtil.setCookie(request, response, "ITCAST_USER", jsonString, 7 * 60 * 60 * 24);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failed";
		}
		return "OK";
	}
}
