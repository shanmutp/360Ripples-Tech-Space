package com.ripples.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripples.service.BankProcessor;
import com.ripples.spring.bean.AccountBean;
import com.ripples.spring.bean.UserBean;

public class RipplesBankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bank.xml");
		UserBean bean = new UserBean();
		bean.setOTP("123");
		bean.setUserName("shanmu");
		bean.setPassword("pass");
		AccountBean account = new AccountBean();

		// Demonstrates auto wire by name also JDBC template qury by string, qury by
		// object, query by list of objects
		BankProcessor b = (BankProcessor) context.getBean("bankProcessor");
		System.out.println("Opening account for a user");
		b.openAccount(account, bean);

		// Add using normal JDBC template insert query
		UserBean newUser = new UserBean();
		newUser.setPassword("360Ripples.");
		newUser.setUserName("Ripples");
		b.addUSer(newUser);

		// Add using normal JDBC template insert querys
		UserBean newUser1 = new UserBean();
		newUser1.setUserName("Tom");
		newUser1.setPassword("Jerry");
		b.addUSerNamedParameter(newUser1);

		// Add using simple JDBC template insert query
		UserBean newUser2 = new UserBean();
		newUser2.setUserName("Tom");
		newUser2.setPassword("Cruise");
		b.addUSerSimpleJDBCTemplate(newUser2);
	}

}
