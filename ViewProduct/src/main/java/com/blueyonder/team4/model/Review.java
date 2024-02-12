package com.blueyonder.team4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Review {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int r_id;
	@OneToOne
	@JoinColumn(name="p_id", referencedColumnName="p_id")
	private Product product;
	private int c_id;
	private String r_desc;
	private int R_stars;
}
