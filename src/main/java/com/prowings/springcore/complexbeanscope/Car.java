package com.prowings.springcore.complexbeanscope;

public abstract class Car {
	
    private static int count = 0;

	private int carId;
	private String companyName;
	private String model;
	private Engine engine;

	public Car() {
		super();
		count++;
        System.out.println("Car created : " + count);
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

//	public Engine getEngine() {
//		return engine;
//	}
//
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}

    // abstract lookup method
    public abstract Engine getEngine();

	
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", companyName=" + companyName + ", model=" + model + ", engine=" + engine + "]";
	}
	
}
