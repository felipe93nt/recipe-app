package com.application.recipe.repositories.impl;

import com.application.recipe.models.Recipe;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RecipeJsonDao {

    public List<Recipe> getRecipes() throws IOException {
        File f = this.getFile("recipes.json");
        Gson gson = new Gson();
        if(f.exists()) {
            Type collectionType = new TypeToken<Collection<Recipe>>(){}.getType();
            return gson.fromJson(
                    FileUtils.readFileToString(f, "UTF-8"),
                    collectionType);
        }
        return new ArrayList<>();
    }

    public Recipe getRecipeById(String id) throws IOException {
        List<Recipe> recipes = this.getRecipes();

        return recipes.stream()
                .filter(r -> id.equals(r.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid id: "+id));
    }

    public void saveRecipe(String fileName, Recipe recipe) throws IOException {
        Gson gson = new Gson();
        List<Recipe> lr = new ArrayList<>();
        lr.addAll(getRecipes());
        lr.add(recipe);

        FileUtils.write(this.getFile(fileName), gson.toJson(lr),"UTF-8");
    }

    public void updateRecipe(String fileName, Recipe rec) throws IOException {
        List<Recipe> recipeList = this.getRecipes();
        Gson gson = new Gson();

        for(Recipe r: recipeList) {
            if(rec.getId().equals(r.getId())) {
                int index = recipeList.indexOf(r);
                recipeList.remove(r);
                recipeList.add(index,rec);
                break;
            }
        }
        File f = this.getFile("recipes.json");
        FileUtils.write(this.getFile(fileName), "","UTF-8");
        FileUtils.write(this.getFile(fileName), gson.toJson(recipeList),"UTF-8");
    }

    public void deleteRecipe(String fileName, String id) throws IOException {
        List<Recipe> recipeList = this.getRecipes();
        Gson gson = new Gson();

        for(Recipe r: recipeList) {
            if(id.equals(r.getId())) {
                int index = recipeList.indexOf(r);
                recipeList.remove(r);
                break;
            }
        }
        File f = this.getFile("recipes.json");
        FileUtils.write(this.getFile(fileName), "","UTF-8");
        FileUtils.write(this.getFile(fileName), gson.toJson(recipeList),"UTF-8");
    }

    public File getFile(String name) {
        File file = new File(name);
        if(!file.exists()) {
            return null;
        }
        return file;
    }

    public void createJsonFile() throws IOException {
        File f = this.getFile("recipes.json");
        if(!f.exists()) {
            Gson gson = new Gson();
            gson.toJson("", new FileWriter("recipes.json"));
        }
    }
}
