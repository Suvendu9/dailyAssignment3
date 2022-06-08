package com.order.app.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.app.demo.entity.Order;
import com.order.app.demo.service.OrderService;
import com.order.app.demo.utils.OrderListResult;
import com.order.app.demo.utils.OrderResult;
import com.order.app.demo.utils.Result;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping
	public Result createStore(@Valid @RequestBody Order order) {
		return orderService.saveOrder(order);
	}

	@GetMapping("/pincode/{pinCode}")
	public OrderListResult getOrdersByPincode(@PathVariable int pinCode) {
		return orderService.getOrdersByPincode(pinCode);
	}

	@GetMapping("/{id}")
	public OrderResult getOrdersByPincode(@PathVariable String id) {
		return orderService.getOrdersById(id);
	}
}
