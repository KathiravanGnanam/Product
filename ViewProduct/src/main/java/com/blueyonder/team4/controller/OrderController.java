package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.model.Order_Table;
import com.blueyonder.team4.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/get")
	public List<Order_Table> getAllOrders(){
		return service.getAllOrders();
	}
	
	@PutMapping("/update")
	public void updateOrder(@RequestParam int o_id,@RequestParam int staff_id) {
		service.updateOrder(o_id,staff_id);
	}
	

}
