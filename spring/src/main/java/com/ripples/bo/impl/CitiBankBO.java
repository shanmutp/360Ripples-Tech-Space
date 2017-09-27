package com.ripples.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ripples.bo.interfaces.IBank;
import com.ripples.dao.interfaces.IUserDAO;
import com.ripples.domain.User;
import com.ripples.spring.bean.UserBean;

public class CitiBankBO implements IBank {

	// Demonstrates setter based injection

	IUserDAO userDao = null;

	@Autowired
	public void setUserDao(IUserDAO dao) {
		this.userDao = dao;
	}

	public boolean validateUser(UserBean bean) {
		// TODO Auto-generated method stub
		boolean response;
		String password = userDao.getUserDetails(bean);
		User user = userDao.getUserDetails(bean.getUserName());
		System.out.println("Validate user CITI BANK credentials =" + password);
		if (password.equals(bean.getPassword())) {
			response = true;
		} else {
			response = false;
		}
		System.out.println("User Details = "+user);
		System.out.println("Users in the DB"+ userDao.getUserDetails());
		return response;

	}
	public void addUser(UserBean bean) {
		userDao.addUser(bean);
	}


	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open account CITI BANK");
	}

	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close account CITI BANK");
	}

	public void addUserNamedParameter(UserBean bean) {
		userDao.addUserNamedParameter(bean);		
	}

	public void addUserSimpleJDBC(UserBean bean) {

		userDao.addUserSimpleJDBCTempate(bean);
	}

}
