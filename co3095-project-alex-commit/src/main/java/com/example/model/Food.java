package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Food {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	
	private String food_name;
	    
    private int grams;
   
    private int suggest_grams;
    
	

	public int getSuggest_grams() {
		return suggest_grams;
	}

	public void setSuggest_grams(int suggest_grams) {
		this.suggest_grams = suggest_grams;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public int getGrams() {
		return grams;
	}

	public void setGrams(int grams) {
		this.grams = grams;
	}

	
	
    

}
