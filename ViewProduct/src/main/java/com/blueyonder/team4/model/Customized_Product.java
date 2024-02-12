package com.blueyonder.team4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customized_Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int p_id;
	private float budget;
	private String thumbnail;
	private String description;
	private double price;
	private int c_id;
}
