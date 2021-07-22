package com.application.recipe.models;


import com.application.recipe.enums.DifficultyEnum;
import com.application.recipe.enums.MealTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
public class Recipe {

    private String id;
    private String title;
    private MealTypeEnum mealType;
    private Integer quantityPeople;
    private DifficultyEnum difficulty;
    private List<Ingredient> ingredients;
    private List<String> steps;

    public Recipe(String id,
                  String title,
                  MealTypeEnum mealType,
                  Integer quantityPeople,
                  DifficultyEnum difficulty,
                  List<Ingredient> ingredients,
                  List<String> steps) {
        this.id = id;
        this.title = title;
        this.mealType = mealType;
        this.quantityPeople = quantityPeople;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.steps = steps;
    }
}
