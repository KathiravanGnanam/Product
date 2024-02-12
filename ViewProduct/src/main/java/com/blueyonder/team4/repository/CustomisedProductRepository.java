package com.blueyonder.team4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Customized_Product;

@Repository
public interface CustomisedProductRepository extends JpaRepository<Customized_Product,Integer> {

}
