package com.skillstorm.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.spring.models.Item;
import com.skillstorm.spring.repositories.ItemRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/item/")
public class ItemController {

	@Autowired
	private ItemRepository repo;

	@GetMapping // GET METHOD
	public List<Item> getItems() {
		// Here we can add custom response codes using @ApiResponse
		// Maybe you want to log some information to a logger 'log.debug'
		return repo.findAll();
	}

}
