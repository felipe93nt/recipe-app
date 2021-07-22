package com.application.recipe.repositories.impl;

import com.application.recipe.models.Recipe;
import com.application.recipe.repositories.IRecipeRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.List;

@Getter
public class RecipeRepository extends RecipeJsonDao implements IRecipeRepository {

    @Value("file.name")
    private String fileName;

    @Override
    public List<Recipe> getRecipes() {
        return this.getRecipes();
    }

    @Override
    public Recipe getRecipeDetails(String id) throws IOException {
        return this.getRecipeById(id);
    }

    @Override
    public void saveRecipe(Recipe recipe) throws IOException {
        this.saveRecipe(this.fileName,recipe);
    }

    @Override
    public void updateRecipe(Recipe recipe) throws IOException {
        this.updateRecipe(this.fileName,recipe);
    }

    @Override
    public void deleteRecipe(String id) throws IOException {
        this.deleteRecipe(this.fileName,id);
    }
}
