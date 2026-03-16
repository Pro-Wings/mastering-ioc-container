package com.prowings.springcore;

public class Correspondance {
	
	private int pin;
	private String city;

	public Correspondance() {
		super();
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Correspondance [pin=" + pin + ", city=" + city + "]";
	}
	
}
