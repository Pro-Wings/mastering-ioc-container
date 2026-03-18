package com.prowings.springcore.hybrid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.springcore.complexbeanscope.Car;

public class TestHybridConfigOfSpringContainer {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hybridSpringContext.xml");
		
		Student std1 = ctx.getBean("std2",Student.class);
		Student std2 = ctx.getBean("std2",Student.class);
		
		System.out.println(std1 == std2);
		
		ctx.close();
		
		System.out.println("main method ended!!");

	
		
	}

}
