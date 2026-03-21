package com.prowings.springcore.circulardependencyresolve;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.emp.Employee;

public class TestCircularDependencyResolution {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("circularDependecny.xml");
		
		
		
		ctx.close();
		System.out.println("main method ended!!");

		
		
	}

}
