package com.prowings.springcore.zeroxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestZeroXmlConfig {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApplicationConfig.class);

//		Animal a = ctx.getBean("animal1", Animal.class);
		
//		System.out.println(a);
		
		System.out.println("main method ended!!");
	}

}
