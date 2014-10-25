package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.UserDao;
import com.test.model.User;

public class UserServiceImpl implements UserService {
    
	@Autowired
	UserDao userDao;
	@Override
	public void insertData(User user) {
		userDao.insertData(user);

	}

	@Override
	public List<User> getUserList() {
		 return userDao.getUserList();
	}

	@Override
	public void deleteData(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateData(User user) {
		// TODO Auto-generated method stub

	}

}
