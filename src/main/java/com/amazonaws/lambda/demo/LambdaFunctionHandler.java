package com.amazonaws.lambda.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class LambdaFunctionHandler implements RequestStreamHandler {

	@Autowired
	private OrderController orderController;

	@Override
	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
		System.out.println("IN 1");

		if (orderController == null)
			orderController = Application.getBean(OrderController.class);
		System.out.println("IN 1");
		orderController.getAllOrders().forEach(l -> System.out.println(l.getCustomerName()));

		System.out.println("IN 1");
		// TODO: Implement your stream handler. See
		// https://docs.aws.amazon.com/lambda/latest/dg/java-handler-io-type-stream.html
		// for more information.
		// This demo implementation capitalizes the characters from the input stream.
		int letter = 0;
		System.out.println("IN 1");
		while ((letter = input.read()) >= 0) {
			output.write(Character.toUpperCase(letter));
		}
		System.out.println("IN 1");
	}

}
