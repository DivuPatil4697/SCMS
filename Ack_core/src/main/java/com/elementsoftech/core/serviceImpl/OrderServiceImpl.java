package com.elementsoftech.core.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elementsoftech.core.entity.OrderHeader;
import com.elementsoftech.core.repositor.OrderHeaderRepository;
import com.elementsoftech.core.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderHeaderRepository Repo;

	@Override
	public OrderHeader addorder(OrderHeader Order) {
		OrderHeader save = Repo.save(Order);
		return save;
	}

}
