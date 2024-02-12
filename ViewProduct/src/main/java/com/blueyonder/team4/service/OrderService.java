package com.blueyonder.team4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Order_Table;
import com.blueyonder.team4.repository.OrderTableRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderTableRepository repo;

	public List<Order_Table> getAllOrders() {
		return repo.findAll();
	}

	public Order_Table updateOrder(Order_Table orderTable) {
		return repo.save(orderTable);
	}

	public void updateOrder(int o_id, int staff_id) {
		repo.updateOrder(o_id,staff_id);
	}
}
