package com.prowings.springcore.zeroxml.subpkg;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	public Vehicle() {
		super();
		System.out.println("Vehicle bean created!!");
	}
	
	

}
