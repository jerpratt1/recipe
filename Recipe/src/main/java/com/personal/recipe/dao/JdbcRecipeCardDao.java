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
        String sql = "SELECT * FROM recipe WHERE recipe_id = 1;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        if(result.next()){
            recipeCard = mapRowToTransferForRecipeCard(result);
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

    private RecipeCard mapRowToTransferForRecipeCard (SqlRowSet result){
        RecipeCard recipeCard = new RecipeCard();

        recipeCard.setRecipeTitle(result.getString("recipe_title"));
        recipeCard.setRecipeImageURL(result.getString("recipe_image_url"));
        recipeCard.setRecipeDescription(result.getString("recipe_description"));
        recipeCard.setPrepTime(result.getInt("prep_time"));
        recipeCard.setCookTime(result.getInt("cook_time"));
        recipeCard.setRestTime(result.getInt("rest_time"));
        recipeCard.setServingSize(result.getInt("serving_size"));
        recipeCard.setTools(result.getString("tools"));
        recipeCard.setIngredients(result.getString("ingredients"));
        recipeCard.setInstructions(result.getString("instructions"));
        recipeCard.setNotes(result.getString("notes"));
        recipeCard.setKeyWords(result.getString("keywords"));


        return recipeCard;
    }
}
