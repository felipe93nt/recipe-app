package com.application.recipe.repositories;

import com.application.recipe.models.Recipe;

import java.util.List;

public interface IRecipeRepository {

    public List<String> getRecipesName();
    public Recipe getRecipeDetails(String id);
    public void saveRecipe(Recipe recipe);
    public void updateRecipe(Recipe recipe);
    public void deleteRecipe(String id);
}
