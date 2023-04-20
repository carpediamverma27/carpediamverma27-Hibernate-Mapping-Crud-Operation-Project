package com.ty.dao;

import java.util.List;

import com.ty.dto.User;

public interface UserDao
{
	public User saveUser(User user);
	
	public boolean deleteUserById(int uid);
	
	public User updateUserById(int uid, User user);
	
	public User getUserById(int uid);
	
	public User getUserByName(String name);
	
	public User getUserByRole(String role);
	
	public List<User> getAllUsers();
}
