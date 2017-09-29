package com.ripples.bo.impl;

import com.ripples.bo.interfaces.IBank;
import com.ripples.spring.bean.UserBean;

public class ICICIBankBO implements IBank {

	public boolean validateUser(UserBean bean) {
		// TODO Auto-generated method stub
		System.out.println("Validate user ICICI BANK PRIVATE LIMITED");
		return false;
	}

	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("raju update Open account ICICI Bank private limited");
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
