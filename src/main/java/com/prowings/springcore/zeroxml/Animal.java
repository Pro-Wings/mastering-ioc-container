package com.prowings.springcore.zeroxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Animal {

//	@Value("124")
	private int id;
//	@Value("aaa")
	private String type;
//	@Value("bbb")
	private String catagory;

	public Animal() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", type=" + type + ", catagory=" + catagory + "]";
	}

}
