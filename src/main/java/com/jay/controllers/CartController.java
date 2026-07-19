package com.jay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jay.services.CartService;

@RestController
@RequestMapping("/api/v1")
public class CartController {
	@Autowired
	private CartService cartService;
	
	@PostMapping("/customer/{customerId}/cart/{productId}")
	public ResponseEntity<?> addToCart(
			@RequestParam("customerId") long customerId,
			@RequestParam("productId") long productId)
	{
		return cartService.addToCart(customerId, productId);
	}
	
	
	@GetMapping("/customer/customer{id}/cart")
	public ResponseEntity<?> getCartItem(@RequestParam("customerId") long customerId)
	{
		return cartService.getCartItem(customerId);
	}

	
}