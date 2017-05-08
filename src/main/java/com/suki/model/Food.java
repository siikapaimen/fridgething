package com.suki.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String food;
	private String brand;
	
	public Food(String food, String brand) {
		super();
		this.food = food;
		this.brand = brand;
	}

	public Food(Long id) {
		super();
		this.id = id;
	}

	public Food() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", food=" + food + ", brand=" + brand + "]";
	}
	
	
	
	

	
	
}
