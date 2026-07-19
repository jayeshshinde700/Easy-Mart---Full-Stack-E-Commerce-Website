package com.jay.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jay.entities.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
	
	List<Cart> findByCustomerId(Long customerId);
	
	boolean existsByCustomerIdAndProductId(long customerId,long productId);
	Optional<Cart> findByCustomerIdAndProductId(long customerId,long productId);
		
}