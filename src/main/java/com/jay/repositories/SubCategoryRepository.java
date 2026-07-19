package com.jay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jay.entities.SubCategory;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

}
