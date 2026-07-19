package com.jay.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jay.entities.Cart;
import com.jay.entities.Customer;
import com.jay.entities.Product;
import com.jay.repositories.CartRepository;
import com.jay.repositories.CustomerRepository;
import com.jay.repositories.ProductRepository;
import com.jay.response_wrapper.UniversalResponse;

@Service
public class CartService 
{

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private UniversalResponse response;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public ResponseEntity<?> addToCart(long customerId,long productId)
	{
		if(cartRepository.existsByCustomerIdAndProductId(customerId, productId))
		{
			return response.send("the product already in the cart",null, HttpStatus.FOUND);
		}
		else
		{
			Customer existingCustomer=customerRepository.findById(customerId).get();
			Product existingProduct=productRepository.findById(productId).get();
			Cart cart = new Cart();
			cart.setCustomer(existingCustomer);
			cart.setProduct(existingProduct);
			cart.setQuantity(1);
			Cart savedCart=cartRepository.save(cart);
			return response.send("Product added to the cart", savedCart, HttpStatus.OK);
		}
	}
	

	
	
	public ResponseEntity<?> getCartItem(long customerId)
	{
		Optional<Customer> existingCustomer = customerRepository.findById(customerId);
		if(existingCustomer.isPresent())
		{
			List<Cart> cartItems= cartRepository.findByCustomerId(customerId);
			return response.send("following cart item found", cartItems, HttpStatus.OK);
			
		}
		else
		{
			return response.send("Customer not exists", existingCustomer, HttpStatus.NOT_FOUND);
		}
	}
	
	
}
