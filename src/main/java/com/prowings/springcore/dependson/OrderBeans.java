//package com.prowings.springcore.dependson;
//
//import java.util.List;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.DependsOn;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//@Component
//public class OrderBeans {
//	
//
//	@Bean("ord2")
////	@DependsOn("ord1")
//	@Lazy
//	public Order getOrder2()
//	{
//		System.out.println("==== Constructing Order2 ====");
//		Order order = new Order();
//		order.setId(1111);
//		order.setOrderNumber("pqr123");
//		order.setCustomerId("efg0909");
//		order.setItems(List.of("Mobile", "Charger","Radio"));
//		return order;
//	}
//	
//	@Bean("ord1")
//	public Order getOrder()
//	{
//		System.out.println("==== Constructing Order1 ====");
//		Order order = new Order();
//		order.setId(1111);
//		order.setOrderNumber("abc123");
//		order.setCustomerId("xyz0909");
//		order.setItems(List.of("Laptop", "Mobile", "Charger","Television"));
//		return order;
//	}
//
//
//}
