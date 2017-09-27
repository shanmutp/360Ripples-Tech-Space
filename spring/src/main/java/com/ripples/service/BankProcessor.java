package com.ripples.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ripples.bo.interfaces.IBank;
import com.ripples.spring.bean.AccountBean;
import com.ripples.spring.bean.UserBean;

public class BankProcessor {
	// autowired using by name
	@Autowired
	private IBank bo = null;

	public void openAccount(AccountBean bean, UserBean user) {
		System.out.println("OPEN ACCOUNT STARTED");
		// TODO Auto-generated method stub
		if (bo.validateUser(user)) {
			bo.openAccount();
			System.out.println("OPEN ACCOUNT COMPLETED");
		} else {
			System.out.println("AUTHENTICATION FAILURE");
		}

	}
	public void addUSer(UserBean bean) {
		// add using jdbc template
		bo.addUser(bean);
	}
	public void addUSerNamedParameter(UserBean bean) {
		// add using named parameter
		bo.addUserNamedParameter(bean);
	}
	public void addUSerSimpleJDBCTemplate(UserBean bean) {
		// add using named parameter
		bo.addUserSimpleJDBC(bean);
	}
	
}
