package com.blueyonder.team4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Category;
import com.blueyonder.team4.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

}
