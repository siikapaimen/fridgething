package com.suki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.suki.model.Student;
import com.suki.model.StudentRepository;

@SpringBootApplication
public class StudentRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(StudentRepository repository) {
		return (args) -> {
			repository.save(new Student("Mary", "Poppins", "mary@mail.com"));
			repository.save(new Student("John", "Johnson", "john@mail.com"));
			repository.save(new Student("Mike", "Mitchell", "mike@email.com"));
			repository.save(new Student("Mary", "Poppins", "mary@mail.com"));
			repository.save(new Student("John", "Johnson", "john@mail.com"));
			repository.save(new Student("Mike", "Mitchell", "mike@email.com"));
			repository.save(new Student("Mary", "Poppins", "mary@mail.com"));
			repository.save(new Student("John", "Johnson", "john@mail.com"));
			repository.save(new Student("Mike", "Mitchell", "mike@email.com"));
		};	
	}
}
