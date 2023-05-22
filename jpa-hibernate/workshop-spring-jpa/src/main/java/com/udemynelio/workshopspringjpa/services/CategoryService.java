package com.udemynelio.workshopspringjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemynelio.workshopspringjpa.entities.Category;
import com.udemynelio.workshopspringjpa.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	
	public Category findById(Long id) {
//		Optional<Category> obj = userRepository.findById(id);
//		return obj.get();
		
		return categoryRepository.findById(id).get();
	}
}
