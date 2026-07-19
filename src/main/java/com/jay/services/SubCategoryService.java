package com.jay.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jay.entities.Category;
import com.jay.entities.SubCategory;
import com.jay.repositories.CategoryRepository;
import com.jay.repositories.SubCategoryRepository;
import com.jay.response_wrapper.UniversalResponse;

@Service
public class SubCategoryService {

	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	UniversalResponse response;
	
	public ResponseEntity<?> addSubCategory (SubCategory subCategory)
	{
		Optional<Category> existingCategory=categoryRepository.findById(subCategory.getCategory().getId());
		if(existingCategory.isPresent())
		{
			subCategory.setCategory(existingCategory.get());
			SubCategory savedSubCategory=subCategoryRepository.save(subCategory);
			return response.send("SubCategory added",savedSubCategory , HttpStatus.OK);
		}
		else
		{
			return response.send("Category does not exist",null , HttpStatus.NOT_FOUND);
		}
	}
	
	
}
