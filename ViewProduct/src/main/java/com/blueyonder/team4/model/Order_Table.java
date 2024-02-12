package com.blueyonder.team4.model;

import java.util.Date;

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
public class Order_Table {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int o_id;
	private int p_id[];
	private int p_qty[];
	private int staff_id;
	private Date o_date;
	private Date o_delivery;
	private String status;
	private String payment_mode;
}
