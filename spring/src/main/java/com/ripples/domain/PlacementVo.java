package com.ripples.domain;

public class PlacementVo 
{
	private String candidateName;
	private String DegreeType;
	private int Marks;
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getDegreeType() {
		return DegreeType;
	}
	public void setDegreeType(String degreeType) {
		DegreeType = degreeType;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	

}
