package com.udemynelio.workshopspringjpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemynelio.workshopspringjpa.entities.Product;
import com.udemynelio.workshopspringjpa.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity <List<Product>> findAll(){
		List<Product> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product userResponse = productService.findById(id);
		return ResponseEntity.ok().body(userResponse);
	}
}
