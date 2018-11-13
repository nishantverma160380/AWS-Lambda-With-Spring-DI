package com.amazonaws.lambda.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private OrderDataSource dataSource;
	
	@RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
	public Orders getOrder(@PathVariable long id) {
		return dataSource.getOrder(id);
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public List<Orders> getAllOrders() {
		return dataSource.getAllOrders();
	}
}