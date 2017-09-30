package com.ripples.spring.bean;
import org.springframework.beans.factory.annotation.Autowired;
public class Employee 
{
	@Autowired
	private String employeeName;
	private int employeeId;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
}
