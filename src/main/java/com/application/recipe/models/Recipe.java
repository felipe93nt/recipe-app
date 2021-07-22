package com.application.recipe.models;


import com.application.recipe.enums.DifficultyEnum;
import com.application.recipe.enums.MealTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Recipe {

    private Long id;
    private String title;
    private MealTypeEnum mealType;
    private Integer quantityPeople;
    private DifficultyEnum difficulty;
    private List<Ingredient> ingredients;
    private List<String> steps;

}
