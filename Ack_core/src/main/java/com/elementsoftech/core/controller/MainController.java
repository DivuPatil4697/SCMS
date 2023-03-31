package com.elementsoftech.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.elementsoftech.core.entity.OrderHeader;
import com.elementsoftech.core.service.OrderService;

public class MainController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/saveOrder")
	public OrderHeader saveOrder(@RequestBody OrderHeader order) {
		OrderHeader addorder = service.addorder(order);
		return addorder;
	}
	

}
