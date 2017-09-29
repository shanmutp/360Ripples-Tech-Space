package com.ripples.spring.bean;

import org.springframework.beans.factory.annotation.Required;

public class Branch {

	public void displayBranchName() {
		System.out.println("Branch Name");
	}

	private String branchName;

	public String getBranchName() {
		return branchName;
	}

	@Required
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
