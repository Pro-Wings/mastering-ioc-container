package com.prowings.springcore.zeroxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = "com.prowings.springcore.zeroxml")

//@ComponentScan(basePackages = "com.prowings.springcore.zeroxml", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = Dog.class))
//@ComponentScan(basePackages = "com.prowings.springcore.zeroxml", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class))
//@ComponentScan(basePackages = "com.prowings.springcore.zeroxml",useDefaultFilters = false, includeFilters = @Filter(type = FilterType.ANNOTATION, classes = Service.class))
//@ComponentScan(basePackages = "com.prowings.springcore.zeroxml",useDefaultFilters = false, includeFilters = @Filter(type = FilterType.REGEX, pattern = "org\\.example\\.repo\\..*"))
//@ComponentScan(basePackages = "com.prowings.springcore.zeroxml",excludeFilters = @Filter(type = FilterType.REGEX, pattern = "com\\.prowings\\.springcore\\.zeroxml\\.subpkg\\..*"))
public class MyApplicationConfig {

//	@Bean("animal1")
//	public Animal getAnimal()
//	{
//		Animal animal = new Animal();
//		animal.setId(111);
//		animal.setCatagory("aaaaaaaaaaaaaaaa");
//		animal.setType("ssssssssssssssssss");
//		return animal;
//	}

}
