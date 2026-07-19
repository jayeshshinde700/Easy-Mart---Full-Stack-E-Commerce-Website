package com.jay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jay.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	boolean existsByEmail(String email);
	boolean existsByPhone(String phone);
}
