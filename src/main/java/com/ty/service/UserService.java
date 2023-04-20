package com.ty.service;

import java.util.List;

import com.ty.dao.imp.UserDaoImp;
import com.ty.dto.User;

public class UserService 
{
	public void saveUser(User user)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user1 = userDaoImp.saveUser(user);
		if(user1!=null)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
	}
	
	public void deleteUserById(int uid)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		boolean flag = userDaoImp.deleteUserById(uid);
		if(flag)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
	}
	
	public User updateUserById(int uid, User user)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user2 = userDaoImp.updateUserById(uid, user);
		if(user2!=null)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("");
		}
		return null;
	}
	
	public User getUserById(int uid)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user = userDaoImp.getUserById(uid);
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	
	public User getUserByName(String name)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user = userDaoImp.getUserByName(name);
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	
	public User getUserByRole(String role)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user = userDaoImp.getUserByRole(role);
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	
	public List<User> getAllUsers()
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		List<User> user = userDaoImp.getAllUsers();
		if(user.size()>0)
		{
			return  user;
		}
		else
		{
			return null;
		}
	}
}
