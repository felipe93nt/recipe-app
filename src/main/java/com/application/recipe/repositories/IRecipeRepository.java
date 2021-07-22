package com.application.recipe.repositories;

import com.application.recipe.models.Recipe;

import java.io.IOException;
import java.util.List;

public interface IRecipeRepository {

    public List<Recipe> getRecipes();
    public Recipe getRecipeDetails(String id) throws IOException;
    public void saveRecipe(Recipe recipe) throws IOException;
    public void updateRecipe(Recipe recipe) throws IOException;
    public void deleteRecipe(String id) throws IOException;
}
