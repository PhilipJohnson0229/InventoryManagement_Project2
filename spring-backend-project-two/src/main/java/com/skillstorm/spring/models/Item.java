package com.skillstorm.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item") // @Table takes class name as default
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name") // @Column takes field name as default
	private String name;

	@Column(name = "price")
	private String price;
	
	@Column(name = "store")
	private String store;
	
	@Column(name = "category")
	private String category;

	public Item() {
		super();
	}

	public Item(int id, String name, String price, String store, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.store = store;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", store=" + store + ", category=" + category
				+ "]";
	}

	

	
}
