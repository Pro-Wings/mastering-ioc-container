package com.prowings.springcore.circulardependency;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.springcore.Student;

public class TestCircularDependencyBeanProblem {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("circularDependencyBeanDemo.xml");
		
		Employee emp = ctx.getBean(Employee.class);
		
		System.out.println(emp);
		
		System.out.println("main method ended!!");

	}

}
