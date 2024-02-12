package com.blueyonder.team4.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

	
	
}
