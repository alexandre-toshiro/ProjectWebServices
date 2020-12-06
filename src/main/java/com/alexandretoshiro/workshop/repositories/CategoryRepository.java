package com.alexandretoshiro.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandretoshiro.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
