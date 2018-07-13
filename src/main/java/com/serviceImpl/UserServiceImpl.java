package com.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
	@Resource(name = "UserDao")
	private UserDao userDao;

	@Override
	public User selectUser(String name) {
		 return userDao.selectUserByName(name);
	}

}
