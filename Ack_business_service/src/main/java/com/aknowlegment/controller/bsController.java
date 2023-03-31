package com.aknowlegment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.aknowlegment.controller.service.service;
import com.elementsoftech.core.entity.OrderHeader;

public class bsController {
	@Autowired
	private service Ser;
	@PostMapping("/save")
	public OrderHeader home(@RequestBody OrderHeader order) {
		Ser.saveOrder(order);
		return null;
	}

}
