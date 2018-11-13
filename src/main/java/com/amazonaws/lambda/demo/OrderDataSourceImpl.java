package com.amazonaws.lambda.demo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OrderDataSourceImpl implements OrderDataSource {
	private List<Orders> orders = OrderData.getOrderData();

	@Override
	public Orders getOrder(long id) {
		return orders.stream().filter(o -> o.getId() == id).findAny().get();
	}

	@Override
	public List<Orders> getAllOrders() {
		return orders;
	}

}