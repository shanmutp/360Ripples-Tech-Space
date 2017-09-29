package com.ripples.dao.interfaces;

import java.util.List;

import com.ripples.domain.User;
import com.ripples.spring.bean.UserBean;
public interface IUserDAO {

	
	public String getUserDetails(UserBean b);
	public User getUserDetails(String userName);
	public List <User> getUserDetails();
	public void addUser(UserBean bean);
	public void addUserNamedParameter(UserBean bean);
	public void addUserSimpleJDBCTempate(UserBean bean);
}
