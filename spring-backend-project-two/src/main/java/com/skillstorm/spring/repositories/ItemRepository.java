package com.skillstorm.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.spring.models.Item;

@Repository 
public interface ItemRepository extends JpaRepository<Item,Integer>{
	// rely on methods provided by JPA repository
	
}
