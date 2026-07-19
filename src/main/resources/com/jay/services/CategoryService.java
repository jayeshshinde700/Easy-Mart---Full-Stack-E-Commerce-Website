package com.jay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jay.entities.Category;
import com.jay.repositories.CategoryRepository;
import com.jay.response_wrapper.UniversalResponse;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	UniversalResponse response;
	
	public ResponseEntity<?> getAllCategories()
	{
		List<Category> categories=categoryRepository.findAll();
		return response.send("follwing categories found", categories, HttpStatus.OK);
	}
}
