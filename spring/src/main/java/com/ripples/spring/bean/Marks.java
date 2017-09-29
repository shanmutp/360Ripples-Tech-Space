package com.ripples.spring.bean;

public class Marks {
	int mathsMarks;
	int scienceMarks;

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int matchMarks) {
		this.mathsMarks = matchMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	@Override
	public String toString() {
		return "Marks [matchMarks=" + mathsMarks + ", scienceMarks=" + scienceMarks + "]";
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

}
