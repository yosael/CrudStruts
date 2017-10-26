package com.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crud.domain.User;
import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class UserDAO implements IUserDAO {
	
	@SessionTarget
	private Session session;
	
	@TransactionTarget
	private Transaction transaccion;

	@Override
	public void saveUserDetail(User user) throws Exception{
		
		try {
			
			session.save(user);
			
		} catch (Exception e) {
			
			transaccion.rollback();
			
			e.printStackTrace();
		}
			
		
	}

	@Override
	public List<User> listarUsuarios() throws Exception {
		
		List<User> users = new ArrayList<User>();
		
		try {
			
			users = session.createQuery("FROM User").list();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return users;
	}
	
	

}
