package com.alexandretoshiro.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandretoshiro.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
