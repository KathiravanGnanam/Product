package com.blueyonder.team4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Order_Table;

import jakarta.transaction.Transactional;

@Repository
public interface OrderTableRepository extends JpaRepository<Order_Table,Integer> {

	@Modifying
    @Transactional
	@Query(value="update order_table set staff_id=:staff_id where o_id=:o_id",nativeQuery=true)
	void updateOrder(int o_id, int staff_id);

}
