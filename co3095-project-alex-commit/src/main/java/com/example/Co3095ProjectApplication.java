package com.example;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Food;
import com.example.model.Recipe;
import com.example.repo.FoodRepo;
import com.example.repo.RecipeRepo;


@SpringBootApplication
public class Co3095ProjectApplication implements ApplicationRunner{

	
	@Autowired
    private FoodRepo foodrepo;
	
	@Autowired
    private RecipeRepo reciperepo;
	

	public static void main(String[] args) {
		SpringApplication.run(Co3095ProjectApplication.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Add food to database
		Food f1 = new Food();
		f1.setFood_name("Beef");
		f1.setGrams(900);
		f1.setSuggest_grams(0);
		f1 = foodrepo.save(f1);
		
		Food f2 = new Food();
		f2.setFood_name("Carrots");
		f2.setGrams(145);
		f2.setSuggest_grams(0);

		f2 = foodrepo.save(f2);
		
		Food f3 = new Food();
		f3.setFood_name("Head Broccoli");
		f3.setGrams(300);
		f3.setSuggest_grams(0);

		f3 = foodrepo.save(f3);
		
		Food f4 = new Food();
		f4.setFood_name("Pasta");
		f4.setGrams(300);
		f4.setSuggest_grams(0);

		f4 = foodrepo.save(f4);
		
		Food f5 = new Food();
		f5.setFood_name("Potato");
		f5.setGrams(100);
		f5.setSuggest_grams(0);

		f5 = foodrepo.save(f5);
		
		Food f6 = new Food();
		f6.setFood_name("long-stem broccoli");
		f6.setGrams(200);
		f6.setSuggest_grams(0);

		f6 = foodrepo.save(f6);
		
		Food f7 = new Food();
		f7.setFood_name("Chicken Breast");
		f7.setGrams(174);
		f7.setSuggest_grams(0);

		f7 = foodrepo.save(f7);
		
		Food f8 = new Food();
		f8.setFood_name("lean pork mince");
		f8.setGrams(350);
		f8.setSuggest_grams(0);
		f8 = foodrepo.save(f8);
		
		Food f9 = new Food();
		f9.setFood_name("egg noodles");
		f9.setGrams(350);
		f9.setSuggest_grams(0);
		f9 = foodrepo.save(f9);
		
		Food f10 = new Food();
		f10.setFood_name("King Prawn");
		f10.setGrams(384);
		f10.setSuggest_grams(0);
		f10 = foodrepo.save(f10);
		
		// Add Recipes to database
		Recipe r1 = new Recipe();
		r1.setRecipe_name("Baked chicken breasts");
		r1.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/baked-chicken-64d9dd7.jpg?quality=90&webp=true&resize=440,400");
		List<Food> foodlist = new ArrayList<>();
		foodlist.add(f7);
		r1.setIngredients(foodlist);
		r1.setUrl("https://www.bbcgoodfood.com/recipes/baked-chicken-lemon");
		r1.setCalorie(252);
		r1 = reciperepo.save(r1);
		
		
		Recipe r2 = new Recipe();
		r2.setRecipe_name("Broccoli pesto & pancetta pasta");
		List<Food> foodlist1 = new ArrayList<>();;
		foodlist1.add(f3);
		foodlist1.add(f4);
		r2.setIngredients(foodlist1);
		r2.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/broccoli-pesto-pancetta-pasta-75e3452.jpg?quality=90&webp=true&resize=186,169");
		r2.setUrl("https://www.bbcgoodfood.com/recipes/broccoli-pesto-pancetta-pasta");
		r2.setCalorie(452);
		r2 = reciperepo.save(r2);
		
		
		Recipe r3 = new Recipe();
		r3.setRecipe_name("Slow-cooker beef stew");
		List<Food> foodlist2 = new ArrayList<>();;
		foodlist2.add(f1);
		foodlist2.add(f2);
		r3.setIngredients(foodlist2);
		r3.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/slow-cooker-beef-stew-8ade07f.jpg?quality=90&resize=360,327");
		r3.setUrl("https://www.bbcgoodfood.com/recipes/slow-cooker-beef-stew");
		r3.setCalorie(474);
		r3 = reciperepo.save(r3);
		
		
		Recipe r4 = new Recipe();
		r4.setRecipe_name("Ricotta, broccoli, & new potato frittata");
		List<Food> foodlist3 = new ArrayList<>();;
		foodlist3.add(f5);
		foodlist3.add(f6);
		r4.setIngredients(foodlist3);
		r4.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/ricotta-broccoli-new-potato-frittata-f920303.jpg?quality=90&webp=true&resize=186,169");
		r4.setUrl("https://www.bbcgoodfood.com/recipes/ricotta-broccoli-new-potato-frittata");
		r4.setCalorie(226);
		r4 = reciperepo.save(r4);
		
		
		Recipe r5 = new Recipe();
		r5.setRecipe_name("Pork noodle stir-fry");
		List<Food> foodlist4 = new ArrayList<>();;
		foodlist4.add(f8);
		foodlist4.add(f9);
		r5.setIngredients(foodlist4);
		r5.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/pork-noodle-stir-fry-3cb19c3.jpg?quality=90&webp=true&resize=440,400");
		r5.setUrl("https://www.bbcgoodfood.com/recipes/pork-noodle-stir-fry");
		r5.setCalorie(599);
		r5 = reciperepo.save(r5);
		
		Recipe r6 = new Recipe();
		r6.setRecipe_name("Chilli prawn linguine");
		List<Food> foodlist5 = new ArrayList<>();;
		foodlist5.add(f10);
		r6.setIngredients(foodlist5);
		r6.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-570_12-6a8d22d.jpg?quality=90&webp=true&resize=500,454");
		r6.setUrl("https://www.bbcgoodfood.com/recipes/chilli-prawn-linguine");
		r6.setCalorie(333);
		r6 = reciperepo.save(r6);
		
	}

}
