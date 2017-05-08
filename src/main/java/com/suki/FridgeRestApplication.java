package com.suki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.suki.model.Food;
import com.suki.model.FoodRepository;

@SpringBootApplication
public class FridgeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeRestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(FoodRepository repository) {
		return (args) -> {
			repository.save(new Food("Mary", "Poppins", "mary@mail.com"));
			repository.save(new Food("John", "Johnson", "john@mail.com"));
			repository.save(new Food("Mike", "Mitchell", "mike@email.com"));
			repository.save(new Food("Mary", "Poppins", "mary@mail.com"));
			repository.save(new Food("John", "Johnson", "john@mail.com"));
			repository.save(new Food("Mike", "Mitchell", "mike@email.com"));
			repository.save(new Food("Mary", "Poppins", "mary@mail.com"));
			repository.save(new Food("John", "Johnson", "john@mail.com"));
			repository.save(new Food("Mike", "Mitchell", "mike@email.com"));
		};	
	}
}
