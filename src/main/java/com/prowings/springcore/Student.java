package com.prowings.springcore;

import java.util.List;

public class Student {
	
	private int roll;
	private String name;
	private Address address;
	private List<String> subjects;
	
	public Student() {
		super();
		
		System.out.println("--- Student no-arg constructor called!!");
		
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
		System.out.println("--inside setter method of rollNumber!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("--inside setter method of name!!");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", subjects=" + subjects + "]";
	}



}
