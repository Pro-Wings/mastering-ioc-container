package com.prowings.springcore.complexbeanscope;

public class Engine {
	
    private static int count = 0;
	
	private int engineId;
	private String name;
	private int cc;

	public Engine() {
		super();
		count++;
        System.out.println("Engine created : " + count);

	}

	public int getEngineId() {
		return engineId;
	}

	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", name=" + name + ", cc=" + cc + "]";
	}

	
	
}
