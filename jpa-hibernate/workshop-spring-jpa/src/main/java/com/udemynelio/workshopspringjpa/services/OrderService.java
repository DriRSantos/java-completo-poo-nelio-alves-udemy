package com.udemynelio.workshopspringjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemynelio.workshopspringjpa.entities.Order;
import com.udemynelio.workshopspringjpa.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	
	public Order findById(Long id) {
//		Optional<Order> obj = userRepository.findById(id);
//		return obj.get();
		
		return orderRepository.findById(id).get();
	}
}
