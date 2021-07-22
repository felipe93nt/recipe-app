package com.application.recipe.repositories.impl;

import com.application.recipe.models.Recipe;
import com.application.recipe.repositories.IRecipeRepository;

import java.util.List;

public class RecipeRepository implements IRecipeRepository {

    @Override
    public List<String> getRecipesName() {
        return null;
    }

    @Override
    public Recipe getRecipeDetails(String id) {
        return null;
    }

    @Override
    public void saveRecipe(Recipe recipe) {

    }

    @Override
    public void updateRecipe(Recipe recipe) {

    }

    @Override
    public void deleteRecipe(String id) {

    }
}
