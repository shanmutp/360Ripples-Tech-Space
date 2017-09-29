package com.ripples.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripples.spring.bean.College;
import com.ripples.spring.bean.Student;

public class RipplesBoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		//inner bean DI and using setter
		Student obj = (Student) context.getBean("student");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getMarks());
		
		
		//constructor DI
		Student obj0 = (Student) context.getBean("student1");
		System.out.println(obj0.getFirstName());
		System.out.println(obj0.getMarks());
		
		//Demonstrating two instances of college object
		College obj1 = (College) context.getBean("college1");
		College obj2 = (College) context.getBean("college2");
		System.out.println(obj1.getCollegeName());
		System.out.println(obj2.getCollegeName());
		
		//Demosntrating autowiring by name
		obj1.branchDisplay();

		//Demosntrating autowiring by type
		obj2.branchDisplay();

		// Check out the @required anotations in Branch Class setBRanchName method.
		
		//check out the Auowired annotation which wires using the bean type
		obj1.driveBus();
		// check out Bus setBusNumber method where the autowire is done with required=true
		// so if the bus number not set this will throw an error
	}

}
