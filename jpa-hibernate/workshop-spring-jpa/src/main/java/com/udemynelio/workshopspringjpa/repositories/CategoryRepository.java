package com.udemynelio.workshopspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemynelio.workshopspringjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
