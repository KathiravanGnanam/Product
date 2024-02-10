package com.blueyonder.team4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
