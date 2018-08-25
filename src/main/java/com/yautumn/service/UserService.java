package com.yautumn.service;

import java.util.List;

import com.yautumn.entity.User;

public interface UserService {
	
	public List<User> getUserList();
	
	public User getUserById(int id);
	
	public int getCount();
	
	public boolean deleteUserById(int id);
	
	public boolean insertUser(User user);

}
