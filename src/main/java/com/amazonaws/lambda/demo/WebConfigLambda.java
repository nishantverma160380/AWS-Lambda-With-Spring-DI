package com.amazonaws.lambda.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfigLambda {
	@Bean
	public OrderController orderController() {
		return new OrderController();
	}
	
	@Bean
	public OrderDataSource orderDataSource() {
		return new OrderDataSourceImpl();
	}
}