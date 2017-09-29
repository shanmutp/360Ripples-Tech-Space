package com.ripples.dao.impl;

import java.util.List;

import com.ripples.dao.interfaces.IUserDAO;
import com.ripples.domain.User;
import com.ripples.spring.bean.UserBean;

public class UserOracleDAOImpl implements IUserDAO {

	public String getUserDetails(UserBean b) {
		// TODO Auto-generated method stub
		System.out.println("Oracle data fecthed");
		return null;
	}

	public User getUserDetails(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	public void addUserNamedParameter(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	public void addUserSimpleJDBCTempate(UserBean bean) {
		// TODO Auto-generated method stub
		
	}



}
