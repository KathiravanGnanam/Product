package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.model.Customized_Product;
import com.blueyonder.team4.service.CustomisedProductService;

@RestController
@RequestMapping("/customised")
public class CustomisedProductController {
	
	@Autowired
	CustomisedProductService service;
	
	@GetMapping("/get")
	public List<Customized_Product> getProduct(){
		return service.getProduct();
	}
}
