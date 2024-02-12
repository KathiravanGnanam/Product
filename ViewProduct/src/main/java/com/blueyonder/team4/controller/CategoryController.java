package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.model.Category;
import com.blueyonder.team4.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/addCategory")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}
	
	@GetMapping("/getCategory")
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}

}
