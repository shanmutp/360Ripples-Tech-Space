package com.ripples.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripples.spring.bean.Employee;

public class EmployeeManagement 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeInfo.xml");
		Employee e = (Employee) context.getBean("EmployeeBeam");
		System.out.println("Employee name	---> "+e.getEmployeeName());
		System.out.println("Employee id	---> "+e.getEmployeeId());
		
	}

}
