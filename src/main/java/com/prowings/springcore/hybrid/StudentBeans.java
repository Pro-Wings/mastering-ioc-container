package com.prowings.springcore.hybrid;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class StudentBeans {
	
	@Bean(name = "std1")
	public Student getStudent1()
	{
		Student std = new Student();
		std.setId(10);
		std.setName("Sham");
		std.setAddress("Pune");
		
		return std;
	}

	@Bean(name = "std2")
//	@Scope("prototype")
	public Student getStudent2()
	{
		Student std = new Student();
		std.setId(20);
		std.setName("Ram");
		std.setAddress("Mumbai");
		
		return std;
	}

}
