package com.udemynelio.workshopspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemynelio.workshopspringjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
