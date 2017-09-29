package com.ripples.bo.interfaces;

import com.ripples.spring.bean.UserBean;

public interface IBank {

	public boolean validateUser(UserBean bean);
	public void openAccount();
	public void closeAccount();
	public void addUser(UserBean bean);
	public void addUserNamedParameter(UserBean bean);
	public void addUserSimpleJDBC(UserBean bean);
}
