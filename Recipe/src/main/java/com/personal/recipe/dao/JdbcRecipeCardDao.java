package com.personal.recipe.dao;

import com.personal.recipe.model.RecipeCard;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcRecipeCardDao implements RecipeCardDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRecipeCardDao (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public RecipeCard getRecipe() {
        RecipeCard recipeCard = new RecipeCard();
        String sql = "SELECT * FROM recipe WHERE recipe_id =1;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        if(result.next()){
            recipeCard.setRecipeTitle(result.getString("recipe_title"));
            return recipeCard;
        }
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
