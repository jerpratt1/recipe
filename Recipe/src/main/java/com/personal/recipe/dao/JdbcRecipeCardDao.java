package com.personal.recipe.dao;

import com.personal.recipe.model.RecipeCard;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcRecipeCardDao implements RecipeCardDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRecipeCardDao (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public RecipeCard getRecipe() {
        return null;

    }

    @Override
    public RecipeCard addRecipe() {
        return null;
    }

    @Override
    public RecipeCard updateRecipe() {
        return null;
    }

    @Override
    public RecipeCard deleteRecipe() {
        return null;
    }
}
