package com.crud.action;



import java.util.ArrayList;
import java.util.List;

import com.crud.dao.UserDAO;
import com.crud.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	
	private User user = new User();
	private List<User> userList = new ArrayList<User>();
	private UserDAO userDAO = new UserDAO();
	
	@Override
	public User getModel() {
		return user;
	}
	
	
	public String addUser()
	{
		try {
			userDAO.saveUserDetail(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	public String listar()
	{
		
		try {
			userList = userDAO.listarUsuarios();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return ERROR;
		}
		
		
		return SUCCESS;
	}
	

}
