package com.prowings.springcore.hybrid.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value("111")
	private int carId;
	@Value("Audi")
	private String companyName;
	@Value("A4")
	private String modelName;

//	@Autowired
//	@Qualifier("engine1")
	private Engine engine;

	public Car() {
		super();
		System.out.println("---- CAR No-Arg Constructor invoked ----");
	}

	@Autowired(required = false)
	public Car(/* @Qualifier("engine1") */Engine engine1) {
		super();
		this.engine = engine;
		System.out.println("---- CAR one-Arg Constructor invoked ----");
	}




	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Engine getEngine() {
		return engine;
	}

//	@Autowired
//	@Qualifier("engine123")
	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("--- setter method for Engine called ---");
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", companyName=" + companyName + ", modelName=" + modelName + ", engine="
				+ engine + "]";
	}
	
	

}
