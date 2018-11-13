package com.amazonaws.lambda.demo;
import java.util.ArrayList;
import java.util.List;

public class OrderData {
	private static List<Orders> orders;
	
	private OrderData() {
		
	}
	
	public static List<Orders> getOrderData() {
		if(orders == null) {
			orders = new ArrayList<>();
			orders.add(new Orders(1, "Laptop", "Shyam"));
			orders.add(new Orders(2, "Hammer", "Thor"));
			orders.add(new Orders(3, "Arc Reactor", "Tony Stark"));
			orders.add(new Orders(4, "Shield", "Steve Rogers"));
			orders.add(new Orders(5, "Beer", "Bruce Banner"));
			orders.add(new Orders(6, "Glock", "Natasha Romanoff"));
			orders.add(new Orders(7, "Coke", "Clint Barton"));
			orders.add(new Orders(8, "Shoes", "Sam Wilson"));
			orders.add(new Orders(9, "Jacket", "Bucky Barns"));
			orders.add(new Orders(10, "Popcorn", "Vision"));
		}
		return orders;
	}
}