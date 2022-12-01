package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Food;

@Repository
public interface FoodRepo extends CrudRepository<Food, Integer>  {

}
