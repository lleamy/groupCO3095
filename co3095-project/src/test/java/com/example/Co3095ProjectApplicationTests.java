package com.example;

import com.example.model.Food;
import com.example.model.Recipe;
import com.example.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

class Co3095ProjectApplicationTests
{
	@Test
	void testFood()
	{
		Food f1 = new Food();
		f1.setFood_name("Beef");
		f1.setGrams(900);
		f1.setSuggest_grams(0);

		Assertions.assertEquals("Beef", f1.getFood_name());
		Assertions.assertEquals(900, f1.getGrams());
		Assertions.assertEquals(0, f1.getSuggest_grams());


		Food f2 = new Food();
		f2.setFood_name("Carrots");
		f2.setGrams(145);
		f2.setSuggest_grams(0);

		Assertions.assertEquals("Carrots", f2.getFood_name());
		Assertions.assertEquals(145, f2.getGrams());
		Assertions.assertEquals(0, f2.getSuggest_grams());


		Food f3 = new Food();
		f3.setFood_name("Head Broccoli");
		f3.setGrams(300);
		f3.setSuggest_grams(0);

		Assertions.assertEquals("Head Broccoli", f3.getFood_name());
		Assertions.assertEquals(300, f3.getGrams());
		Assertions.assertEquals(0, f3.getSuggest_grams());


		Food f4 = new Food();
		f4.setFood_name("Pasta");
		f4.setGrams(300);
		f4.setSuggest_grams(0);

		Assertions.assertEquals("Pasta", f4.getFood_name());
		Assertions.assertEquals(300, f4.getGrams());
		Assertions.assertEquals(0, f4.getSuggest_grams());


		Food f5 = new Food();
		f5.setFood_name("Potato");
		f5.setGrams(100);
		f5.setSuggest_grams(0);

		Assertions.assertEquals("Potato", f5.getFood_name());
		Assertions.assertEquals(100, f5.getGrams());
		Assertions.assertEquals(0, f5.getSuggest_grams());


		Food f6 = new Food();
		f6.setFood_name("long-stem broccoli");
		f6.setGrams(200);
		f6.setSuggest_grams(0);

		Assertions.assertEquals("long-stem broccoli", f6.getFood_name());
		Assertions.assertEquals(200, f6.getGrams());
		Assertions.assertEquals(0, f6.getSuggest_grams());


		Food f7 = new Food();
		f7.setFood_name("Chicken Breast");
		f7.setGrams(174);
		f7.setSuggest_grams(0);

		Assertions.assertEquals("Chicken Breast", f7.getFood_name());
		Assertions.assertEquals(174, f7.getGrams());
		Assertions.assertEquals(0, f7.getSuggest_grams());


		Food f8 = new Food();
		f8.setFood_name("lean pork mince");
		f8.setGrams(350);
		f8.setSuggest_grams(0);

		Assertions.assertEquals("lean pork mince", f8.getFood_name());
		Assertions.assertEquals(350, f8.getGrams());
		Assertions.assertEquals(0, f8.getSuggest_grams());


		Food f9 = new Food();
		f9.setFood_name("egg noodles");
		f9.setGrams(350);
		f9.setSuggest_grams(0);

		Assertions.assertEquals("egg noodles", f9.getFood_name());
		Assertions.assertEquals(350, f9.getGrams());
		Assertions.assertEquals(0, f9.getSuggest_grams());


		Food f10 = new Food();
		f10.setFood_name("King Prawn");
		f10.setGrams(384);
		f10.setSuggest_grams(0);

		Assertions.assertEquals("King Prawn", f10.getFood_name());
		Assertions.assertEquals(384, f10.getGrams());
		Assertions.assertEquals(0, f10.getSuggest_grams());

	}

	@Test
	void testRecipe()
	{
		Food f1 = new Food();
		f1.setFood_name("Beef");
		f1.setGrams(900);
		f1.setSuggest_grams(0);

		Food f2 = new Food();
		f2.setFood_name("Carrots");
		f2.setGrams(145);
		f2.setSuggest_grams(0);


		Recipe r1 = new Recipe();
		r1.setRecipe_name("Baked chicken breasts");
		r1.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/baked-chicken-64d9dd7.jpg?quality=90&webp=true&resize=440,400");
		List<Food> foodlist = new ArrayList<>();
		foodlist.add(f1);
		r1.setIngredients(foodlist);
		r1.setUrl("https://www.bbcgoodfood.com/recipes/baked-chicken-lemon");
		r1.setCalorie(252);

		Assertions.assertEquals("Baked chicken breasts", r1.getRecipe_name());
		Assertions.assertEquals("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/baked-chicken-64d9dd7.jpg?quality=90&webp=true&resize=440,400", r1.getPic());
		Assertions.assertEquals(foodlist, r1.getIngredients());
		Assertions.assertEquals("https://www.bbcgoodfood.com/recipes/baked-chicken-lemon", r1.getUrl());
		Assertions.assertEquals(252, r1.getCalorie());


		Recipe r2 = new Recipe();
		r2.setRecipe_name("Broccoli pesto & pancetta pasta");
		List<Food> foodlist1 = new ArrayList<>();;
		foodlist1.add(f1);
		foodlist1.add(f2);
		r2.setIngredients(foodlist1);
		r2.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/broccoli-pesto-pancetta-pasta-75e3452.jpg?quality=90&webp=true&resize=186,169");
		r2.setUrl("https://www.bbcgoodfood.com/recipes/broccoli-pesto-pancetta-pasta");
		r2.setCalorie(452);

		Assertions.assertEquals("Broccoli pesto & pancetta pasta", r2.getRecipe_name());
		Assertions.assertEquals("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/broccoli-pesto-pancetta-pasta-75e3452.jpg?quality=90&webp=true&resize=186,169", r2.getPic());
		Assertions.assertEquals(foodlist1, r2.getIngredients());
		Assertions.assertEquals("https://www.bbcgoodfood.com/recipes/broccoli-pesto-pancetta-pasta", r2.getUrl());
		Assertions.assertEquals(452, r2.getCalorie());


		Recipe r3 = new Recipe();
		r3.setRecipe_name("Slow-cooker beef stew");
		List<Food> foodlist2 = new ArrayList<>();;
		foodlist2.add(f1);
		foodlist2.add(f2);
		r3.setIngredients(foodlist2);
		r3.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/slow-cooker-beef-stew-8ade07f.jpg?quality=90&resize=360,327");
		r3.setUrl("https://www.bbcgoodfood.com/recipes/slow-cooker-beef-stew");
		r3.setCalorie(474);

		Assertions.assertEquals("Slow-cooker beef stew", r3.getRecipe_name());
		Assertions.assertEquals("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/slow-cooker-beef-stew-8ade07f.jpg?quality=90&resize=360,327", r3.getPic());
		Assertions.assertEquals(foodlist2, r3.getIngredients());
		Assertions.assertEquals("https://www.bbcgoodfood.com/recipes/slow-cooker-beef-stew", r3.getUrl());
		Assertions.assertEquals(474, r3.getCalorie());


		Recipe r4 = new Recipe();
		r4.setRecipe_name("Ricotta, broccoli, & new potato frittata");
		List<Food> foodlist3 = new ArrayList<>();;
		foodlist3.add(f2);
		r4.setIngredients(foodlist3);
		r4.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/ricotta-broccoli-new-potato-frittata-f920303.jpg?quality=90&webp=true&resize=186,169");
		r4.setUrl("https://www.bbcgoodfood.com/recipes/ricotta-broccoli-new-potato-frittata");
		r4.setCalorie(226);

		Assertions.assertEquals("Ricotta, broccoli, & new potato frittata", r4.getRecipe_name());
		Assertions.assertEquals("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/ricotta-broccoli-new-potato-frittata-f920303.jpg?quality=90&webp=true&resize=186,169", r4.getPic());
		Assertions.assertEquals(foodlist3, r4.getIngredients());
		Assertions.assertEquals("https://www.bbcgoodfood.com/recipes/ricotta-broccoli-new-potato-frittata", r4.getUrl());
		Assertions.assertEquals(226, r4.getCalorie());


		Recipe r5 = new Recipe();
		r5.setRecipe_name("Pork noodle stir-fry");
		List<Food> foodlist4 = new ArrayList<>();;
		foodlist4.add(f2);
		foodlist4.add(f1);
		r5.setIngredients(foodlist4);
		r5.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/pork-noodle-stir-fry-3cb19c3.jpg?quality=90&webp=true&resize=440,400");
		r5.setUrl("https://www.bbcgoodfood.com/recipes/pork-noodle-stir-fry");
		r5.setCalorie(599);

		Assertions.assertEquals("Pork noodle stir-fry", r5.getRecipe_name());
		Assertions.assertEquals("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/pork-noodle-stir-fry-3cb19c3.jpg?quality=90&webp=true&resize=440,400", r5.getPic());
		Assertions.assertEquals(foodlist4, r5.getIngredients());
		Assertions.assertEquals("https://www.bbcgoodfood.com/recipes/pork-noodle-stir-fry", r5.getUrl());
		Assertions.assertEquals(599, r5.getCalorie());


		Recipe r6 = new Recipe();
		r6.setRecipe_name("Chilli prawn linguine");
		List<Food> foodlist5 = new ArrayList<>();;
		foodlist5.add(f1);
		r6.setIngredients(foodlist5);
		r6.setPic("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-570_12-6a8d22d.jpg?quality=90&webp=true&resize=500,454");
		r6.setUrl("https://www.bbcgoodfood.com/recipes/chilli-prawn-linguine");
		r6.setCalorie(333);

		Assertions.assertEquals("Chilli prawn linguine", r6.getRecipe_name());
		Assertions.assertEquals("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-570_12-6a8d22d.jpg?quality=90&webp=true&resize=500,454", r6.getPic());
		Assertions.assertEquals(foodlist5, r6.getIngredients());
		Assertions.assertEquals("https://www.bbcgoodfood.com/recipes/chilli-prawn-linguine", r6.getUrl());
		Assertions.assertEquals(333, r6.getCalorie());
	}

	@Test
	void testUser()
	{
		User u1 = new User();
		u1.setHeight(190);
		u1.setWeight(75);
		u1.setAge(22);
		u1.setGender(1);
		u1.setChoice(1);

		Assertions.assertEquals(190, u1.getHeight());
		Assertions.assertEquals(75, u1.getWeight());
		Assertions.assertEquals(22, u1.getAge());
		Assertions.assertEquals(1, u1.getGender());
		Assertions.assertEquals(1, u1.getChoice());


		User u2 = new User();
		u2.setHeight(165);
		u2.setWeight(55);
		u2.setAge(17);
		u2.setGender(2);
		u2.setChoice(3);

		Assertions.assertEquals(165, u2.getHeight());
		Assertions.assertEquals(55, u2.getWeight());
		Assertions.assertEquals(17, u2.getAge());
		Assertions.assertEquals(2, u2.getGender());
		Assertions.assertEquals(3, u2.getChoice());


		User u3 = new User();
		u3.setHeight(183);
		u3.setWeight(100);
		u3.setAge(45);
		u3.setGender(1);
		u3.setChoice(3);

		Assertions.assertEquals(183, u3.getHeight());
		Assertions.assertEquals(100, u3.getWeight());
		Assertions.assertEquals(45, u3.getAge());
		Assertions.assertEquals(1, u3.getGender());
		Assertions.assertEquals(3, u3.getChoice());
	}

}
