package com.ripples.bo.impl;

import com.ripples.bo.interfaces.IBank;
import com.ripples.spring.bean.UserBean;

public class ICICIBankBO implements IBank {

	public boolean validateUser(UserBean bean) {
		// TODO Auto-generated method stub
		System.out.println("Validate user ICICI");
		return false;
	}

	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open account ICICI");
	}

	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close account ICICI");
	}

	public void addUser(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	public void addUserNamedParameter(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	public void addUserSimpleJDBC(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

}
