package com.prowings.springcore.zeroxml;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
//@Controller
public class Cat {
	
	private int id;
	private String name;

	public Cat() {
		super();
		System.out.println("Cat bean created!!");
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
		return "Cat [id=" + id + ", name=" + name + "]";
	}
	
	

}
