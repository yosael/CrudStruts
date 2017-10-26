package com.crud.dao;

import java.util.List;

import com.crud.domain.User;

public interface IUserDAO {

	void saveUserDetail(User user) throws Exception;
	
	List<User> listarUsuarios() throws Exception;
}
