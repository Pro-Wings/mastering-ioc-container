package com.prowings.springcore.complexbeanscope;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.springcore.Student;

public class TestComplexBeanScopes {
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("complexBeanScopeDemo.xml");
		
		Car car = ctx.getBean(Car.class);
		Car car1 = ctx.getBean(Car.class);
		
		
		System.out.println("Car ref equality : "+(car == car1));

		System.out.println("Engine ref equality : "+(car.getEngine() == car1.getEngine()));
		
		
		System.out.println("main method ended!!");

	}

}
