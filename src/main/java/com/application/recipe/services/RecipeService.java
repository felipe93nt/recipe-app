package com.application.recipe.services;

import com.application.recipe.models.Recipe;
import com.application.recipe.repositories.impl.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<String> getRecipesName() {
        List<Recipe> recipes = this.recipeRepository.getRecipes();

        return recipes.stream()
                .map(r -> r.getTitle()).collect(Collectors.toList());
    }
}
