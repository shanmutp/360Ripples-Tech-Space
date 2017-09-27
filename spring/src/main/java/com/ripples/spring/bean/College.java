package com.ripples.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	String collegeName;

	@Autowired
	private Bus bus;

	public Bus getBus() {
		return bus;
	}

	// @Autowired // if this is used with the property the setter method can be
	// ignored
	/*
	 * public void setBus(Bus bus) { this.bus = bus; }
	 */
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public College(String collegeName) {
		super();
		this.collegeName = collegeName;
	}

	private Branch branch;

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public void branchDisplay() {
		branch.displayBranchName();
	}

	public void driveBus() {
		bus.driveBus();
	}

}
