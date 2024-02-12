package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.model.Review;
import com.blueyonder.team4.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	ReviewService service;
	
	@GetMapping("/getFeedback")
	public List<Review> getFeedBack(){
		return service.getFeedBack();
	}

}
