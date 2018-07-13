package com.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.service.UserService;

@RestController
public class UserController {
	@Resource(name = "UserServiceImpl")
	private UserService userService;

	@RequestMapping("/user")
	public User findOne(String name) {
		name = "zhao";
		User u = userService.selectUser(name);
		System.out.println(u.getName());
		return null;
	}
}
