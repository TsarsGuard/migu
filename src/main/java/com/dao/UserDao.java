package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.User;


@Repository("UserDao")
public interface UserDao {
	User selectUserByName (String name);
}
