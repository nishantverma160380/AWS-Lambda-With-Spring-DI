package com.amazonaws.lambda.demo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface OrderDataSource {
	public Orders getOrder(long id);
	public List<Orders> getAllOrders();
}