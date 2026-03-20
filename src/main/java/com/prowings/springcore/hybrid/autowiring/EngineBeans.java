package com.prowings.springcore.hybrid.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class EngineBeans {
	
	@Bean("engine1")
//	@Primary
	public Engine getEngine1()
	{
		Engine e1 = new Engine();
		e1.setEngineId(1212);
		e1.setEngineName("Fiat-Engine");
		return e1;
	}

	@Bean("engine123")
	public Engine getEngine2()
	{
		Engine e1 = new Engine();
		e1.setEngineId(9090);
		e1.setEngineName("V12-Engine");
		return e1;
	}

}
