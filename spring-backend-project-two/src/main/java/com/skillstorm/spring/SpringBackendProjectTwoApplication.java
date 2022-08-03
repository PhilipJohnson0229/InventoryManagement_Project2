package com.skillstorm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skillstorm.spring.models.Item;
import com.skillstorm.spring.models.Store;
import com.skillstorm.spring.repositories.ItemRepository;
import com.skillstorm.spring.repositories.StoreRepository;

@SpringBootApplication                                     //tomcat server
public class SpringBackendProjectTwoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		// Application Context
		SpringApplication.run(SpringBackendProjectTwoApplication.class, args);
	}

	@Autowired
	ItemRepository repo;
	
	@Autowired
	StoreRepository storeRepo;

	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Item(1,"Pokemon Cards Deck", "60.00", "Targe", "Toys"));
		repo.save(new Item(2,"Spam", "10.00", "CBS", "Food"));
		repo.save(new Item(3,"Candles", "20.00", "Targe", "Decor"));
		repo.save(new Item(4,"Swiss Cheese", "30.00", "Warmart", "Food"));
		
		storeRepo.save(new Store(1,"Targe'","123 Somewhere Rd. Jacksonville FL 12345"));
		storeRepo.save(new Store(2,"CBS","123 Somewhere Rd. Jacksonville FL 12345"));
		storeRepo.save(new Store(3,"Warmart","123 Somewhere Rd. Jacksonville FL 12345"));
	}

}
