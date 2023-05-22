package com.udemynelio.workshopspringjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemynelio.workshopspringjpa.entities.Product;
import com.udemynelio.workshopspringjpa.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	
	public Product findById(Long id) {
//		Optional<Product> obj = userRepository.findById(id);
//		return obj.get();
		
		return productRepository.findById(id).get();
	}
}
