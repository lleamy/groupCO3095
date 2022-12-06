package com.example.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Food;
import com.example.model.Recipe;
import com.example.model.User;
import com.example.repo.RecipeRepo;
import com.example.repo.UserRepo;



@Controller
public class UserDetailController {
		   
	
	@Autowired
    private UserRepo userrepo;
	
	
	
	@Autowired
    private RecipeRepo reciperepo;
	
	/*
	 * Redirect to localhost:8080/homepage
	 */
	@GetMapping("/homepage")
    public String home() {
        return "user";
    }

	/*
	 * Used to get the user body details, calculate BMR under different conditions and recommend 3 random recipes
	 */
	@PostMapping("/getUserDetail")
	public String createUser(Model model, @RequestParam("height") int height,@RequestParam("choice") int choice, @RequestParam("gender") int gender, @RequestParam("weight") int weight, @RequestParam("age") int age, @RequestParam("amount") int amount_of_exercise) {
		
		// Create a new user and set all the body data from the URL
		User user1 = new User();
		user1.setAge(age);
		user1.setAmount_of_exercise(amount_of_exercise);
		user1.setHeight(height);
		user1.setWeight(weight);
		user1.setGender(gender);
		user1.setChoice(choice);
		
		// Create a variable BMR
		double bmr = 0.0;
		
		// Normal BMR for male
		if (gender == 1) {
			bmr = 66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
		}
		
		// Normal BMR for female
		if (gender == 2) {
			bmr = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
		}
		
		/*
		 *  Stay in Shape Under different amount of exercise
		 *  amount of exercise: 
		 *  1 -> Never work      		BMR *1.2
		 *  2 -> 1 - 3 days per week 	BMR *1.375
		 *  3 -> 3 - 5 days per week	BMR *1.55
		 *  4 -> 6 - 7 days per week	BMR *1.725
		 */
		
		if (amount_of_exercise == 1 ) {
			bmr *= 1.2;
		}else if (amount_of_exercise == 2 ) {
			bmr *= 1.375;
		}else if (amount_of_exercise == 3) {
			bmr *= 1.55;
		}else if (amount_of_exercise == 4 ) {
			bmr *= 1.725;
		}
		
		// choice = 1 is Lose Fat, which will be Stay in Shape BMR - 550
		if (choice == 1) {
			bmr -= 550;
		}
		
		// choice = 2 is Gain Fat, which will be Stay in Shape BMR + 500
		if (choice == 2) {
			bmr += 500;
		}
		
		// To make the BMR become 2 decimal numbers
	    BigDecimal bd = new BigDecimal(bmr).setScale(2, RoundingMode.HALF_UP);
	    double new_bmr = bd.doubleValue();
	    
	    // Create a variable to calculate BMR per meal and set it to database
	    int new_bmr_per_meal = (int) (new_bmr / 3) ;
		user1.setCalorie(new_bmr);
		user1 = userrepo.save(user1);
		
		// Pass the result to the JSP file
		model.addAttribute("bmr_per_meal", new_bmr_per_meal);
		model.addAttribute("bmr", user1.getCalorie());
		
		/*
		 *  Use for loop to calculate the Ratio between each recipe calorie and BMR calorie per meal
		 *  Another inner for loop to apply the ratio to all the original ingredients grams 
		 *  For example: BMR per meal is 400 kcal. This recipe is 200 kcal. Ratio is 400/200 = 2.
		 *  This recipe contains beef 200 grams. To fit BMR per meal, 200 * 2 = 400 grams. Suggest user to eat 400 grams.
		 */
		float ratio = 0;
		for (int i = 1; i < 7; i++) {
			
			Recipe r = reciperepo.findById(i).get();
			ratio = new_bmr_per_meal/r.getCalorie();  // Calculate the ratio of the current recipe 
			
			// Change all the ingredients grams to suggest grams
			for (int j = 0; j < r.getIngredients().size(); j++) {
				Food f = r.getIngredients().get(j);
				int new_gram = (int) (f.getGrams() * ratio);
				f.setSuggest_grams(new_gram);
			}
			
		}
		
		/*
		 *  Get 3 random recipes for users
		 *  Create a list ids to collect 3 random recipe id.
		 *  id is from 1 to 6. Use while loop to random 3 times and add it to the list.
		 *  Check if the id has picked before. If not, add to the list. 
		 */
		List<Integer> ids = new ArrayList<>();
		Random rand = new Random();
		int min = 1;
		int max = 6;
		while (ids.size()<3) {
			int random = rand.nextInt((max - min) + 1) + min;
			if (!ids.contains(random)){
				ids.add(random);
			}
		}
		
		// Show all the selected random recipes
		model.addAttribute("recipe", reciperepo.findAllById(ids));
	
		
		return "result";
	}
	
	

}
