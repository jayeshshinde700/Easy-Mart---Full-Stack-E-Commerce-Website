package com.jay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jay.entities.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

	boolean existsByEmail(String email);
	boolean existsByPhone(String phone);
	boolean existsByShopName(String shopName);
}
