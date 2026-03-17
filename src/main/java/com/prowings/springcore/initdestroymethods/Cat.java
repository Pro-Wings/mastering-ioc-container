package com.prowings.springcore.initdestroymethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat /* implements InitializingBean, DisposableBean */{
	
	private int catId;
	private String breedName;
	private String ownerName;
	
	public Cat() {
		super();
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getBreedName() {
		return breedName;
	}
	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Cat [catId=" + catId + ", breedName=" + breedName + ", ownerName=" + ownerName + "]";
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		
//		System.out.println(">>>>>>>>> inside after properties set method!!!!! <<<<<<<");
//		
//	}
//	@Override
//	public void destroy() throws Exception {
//		
//		System.out.println(">>>>>>>>> inside destroy method of disposableBean!!!!! <<<<<<<");
//	}

	public void customInit()
	{
		System.out.println(">>>>>>>>> inside my custom init method!!!!! <<<<<<<");
	}

	public void customDestroy()
	{
		System.out.println(">>>>>>>>> inside my custom Destroy method!!!!! <<<<<<<");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("---------- finalize method called -----------");
		super.finalize();
		
	}
	
	

}
