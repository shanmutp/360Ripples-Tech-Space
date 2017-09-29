package com.ripples.spring.bean;
import org.springframework.beans.factory.annotation.Autowired;
public class Bus {
	private String busNumber;

	public String getBusNumber() {
		return busNumber;
	}

	@Autowired (required=true)
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public void driveBus() {
		System.out.println("Vrooommm****");
	}

}
