package com.udemynelio.workshopspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemynelio.workshopspringjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
