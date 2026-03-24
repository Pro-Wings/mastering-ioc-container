package com.prowings.springcore.zeroxml;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service
public class Dog {
	
	private int id;
	private String name;

	public Dog() {
		super();
		System.out.println("dog bean created!!!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
	

}
