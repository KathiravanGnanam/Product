package com.blueyonder.team4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Customized_Product;
import com.blueyonder.team4.repository.CustomisedProductRepository;

@Service
public class CustomisedProductService {

	@Autowired
	CustomisedProductRepository repo;
	
	public List<Customized_Product> getProduct() {
		return repo.findAll();
	}

}
