package com.prowings.springcore.hybrid.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.emp.Employee;
import com.prowings.springcore.complexbeanscope.Car;

public class TestBeanCreationFromJar {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hybridSpringContext.xml");
		
//		Employee e = ctx.getBean(Employee.class);

		Employee e1 = ctx.getBean("emp",Employee.class);
		
		System.out.println(e1);
		
		ctx.close();
		
		System.out.println("main method ended!!");

	
		
	}

}
