package com.blueyonder.team4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int p_id;
	private String name;
	private String thumbnail;
	private int cat_id;
	private double price;
	private String details;
	private int qty;
	
}
