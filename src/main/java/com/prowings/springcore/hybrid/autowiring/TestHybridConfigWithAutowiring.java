package com.prowings.springcore.hybrid.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestHybridConfigWithAutowiring {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hybridSpringContext.xml");
		
		Car car = ctx.getBean(Car.class);
		
		System.out.println(car);
		
		ctx.close();
		
		System.out.println("main method ended!!");

	
		
	}

}
