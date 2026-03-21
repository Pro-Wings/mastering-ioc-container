package com.prowings.springcore.zeroxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prowings.springcore.zeroxml")
public class MyApplicationConfig {
	
	
	@Bean("animal1")
	public Animal getAnimal()
	{
		Animal animal = new Animal();
		animal.setId(111);
		animal.setCatagory("aaaaaaaaaaaaaaaa");
		animal.setType("ssssssssssssssssss");
		return animal;
	}

}
