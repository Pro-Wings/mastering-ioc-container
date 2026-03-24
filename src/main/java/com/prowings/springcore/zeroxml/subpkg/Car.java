package com.prowings.springcore.zeroxml.subpkg;

import org.springframework.context.annotation.Conditional;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Conditional(ARAIPass.class)
public class Car {

	public Car() {
		super();
		System.out.println("car bean created!!");
	}
	
	

}
