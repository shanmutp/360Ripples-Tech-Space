package com.ripples.spring.bean;

public class Student {

	private Marks marks;

	public Student(Marks marks) {
		super();
		this.marks = marks;
	}
	public Student() {
		super();
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void init() {
		System.out.println("Student bean initialization");
	}
}
