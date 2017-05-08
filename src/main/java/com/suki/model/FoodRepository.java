package com.suki.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findByLastName(String lastName);
}
