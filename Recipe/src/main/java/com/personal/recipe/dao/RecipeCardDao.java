package com.personal.recipe.dao;

import com.personal.recipe.model.RecipeCard;

public interface RecipeCardDao {

    RecipeCard getRecipe();

    RecipeCard addRecipe();

    RecipeCard updateRecipe();

    RecipeCard deleteRecipe();
}
