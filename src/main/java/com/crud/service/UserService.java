package com.crud.service;

import java.util.List;

import com.crud.dao.IUserDAO;
import com.crud.dao.UserDAO;
import com.crud.domain.User;

public class UserService {
	
	private IUserDAO userDAO = new UserDAO();
	
	public void saveUserDetail(User user) throws Exception{
		
		userDAO.saveUserDetail(user);
	}
	
	public List<User> findAll() throws Exception
	{		
		
		return userDAO.listarUsuarios();
		
	}

}
