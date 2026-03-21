package com.prowings.springcore.dependson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.emp.Employee;

public class TestDependsOn {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("testDependsOn.xml");
		
		System.out.println("container started!!");
		Order o2 = ctx.getBean("ord2", Order.class);
		
		System.out.println(o2);
		ctx.close();
		
		System.out.println("main method ended!!");

		
		
	}

}
