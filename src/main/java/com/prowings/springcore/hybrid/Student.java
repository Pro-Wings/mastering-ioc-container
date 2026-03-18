package com.prowings.springcore.hybrid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {
//	@Value("10")
	private int id;
//	@Value("Ram")
	private String name;
//	@Value("Pune")
	private String address;

	public Student() {
		super();
		System.out.println("inside Student() no-arg constructor!!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("inside setter method of Student - setId..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("inside setter method of Student - setName..");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		System.out.println("inside setter method of Student - setAddress..");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@PostConstruct
	public void customInit()
	{
		System.out.println("----------inside custom init method of Student class-----------");
	}

	@PreDestroy
	public void customDestroy()
	{
		System.out.println("----------inside custom destroy method of Student class-----------");
	}

}
