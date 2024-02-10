package com.blueyonder.team4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Category;
import com.blueyonder.team4.model.Product;
import com.blueyonder.team4.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	public void updateProduct(int id) {
		productRepository.deleteById(id);;
	}

	public Product addProducts(Product product) {
		return productRepository.save(product);
	}

	
}
