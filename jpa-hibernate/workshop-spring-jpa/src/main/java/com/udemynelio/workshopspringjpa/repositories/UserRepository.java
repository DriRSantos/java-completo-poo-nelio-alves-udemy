package com.udemynelio.workshopspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemynelio.workshopspringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
