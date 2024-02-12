package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.model.Product;
import com.blueyonder.team4.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/get")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product){
		return productService.addProducts(product);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product){
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	
	
}
