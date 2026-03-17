package com.prowings.springcore.initdestroymethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.springcore.circulardependency.Employee;

public class TestBeanLifecycleMethods {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx =
		        new ClassPathXmlApplicationContext("beanLifecycleMethodsDemo.xml");

		ctx.registerShutdownHook();
		
		Cat cat = ctx.getBean(Cat.class);
		
		System.out.println(cat);
		
		ctx.registerShutdownHook();
		
		
		System.out.println("main method ended!!");

	}

}
