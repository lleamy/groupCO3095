package com.example.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Recipe;



@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Integer>  {


}
