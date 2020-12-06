package com.alexandretoshiro.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandretoshiro.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
