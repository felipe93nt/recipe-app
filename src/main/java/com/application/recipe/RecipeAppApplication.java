package com.application.recipe;

import com.application.recipe.enums.DifficultyEnum;
import com.application.recipe.enums.MealTypeEnum;
import com.application.recipe.models.Ingredient;
import com.application.recipe.models.Recipe;
import com.application.recipe.repositories.impl.RecipeJsonDao;
import com.google.gson.Gson;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class RecipeAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(RecipeAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*System.out.println("Inicializando programa...");
		RecipeJsonDao rjd = new RecipeJsonDao();
		rjd.createJsonFile();

		Gson gson = new Gson();
		Recipe r = new Recipe("24329432","Salsa vermelha", MealTypeEnum.LUNCH,2, DifficultyEnum.INTERMEDIATE,
								Arrays.asList(new Ingredient("1","salsa",200,"g")),
								Arrays.asList("1. cut salsa","2. put it in a plate"));

		rjd.saveRecipe("recipes.json",r);*/
	}

}
