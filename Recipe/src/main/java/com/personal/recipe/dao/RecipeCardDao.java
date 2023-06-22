package com.personal.recipe.dao;

import com.personal.recipe.model.RecipeCard;

import java.util.List;

public interface RecipeCardDao {

    RecipeCard getRecipe();

    List<RecipeCard> getAllRecipe();

    RecipeCard addRecipe(RecipeCard recipeCard);

    RecipeCard updateRecipe();

    RecipeCard deleteRecipe();
}
