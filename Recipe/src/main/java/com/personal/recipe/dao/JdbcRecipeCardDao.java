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
    public RecipeCard addRecipe(RecipeCard recipeCard) {
        String sql = "INSERT INTO recipe (recipe_title, recipe_description, prep_time," +
                " cook_time, rest_time, serving_size, tools, ingredients, instructions, notes, keywords)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) returning recipe_id";
        Integer recipeId = jdbcTemplate.queryForObject(sql, Integer.class, recipeCard.getRecipeTitle(),
                recipeCard.getRecipeDescription(), recipeCard.getPrepTime(), recipeCard.getCookTime(),
                recipeCard.getRestTime(), recipeCard.getServingSize(), recipeCard.getTools(),
                recipeCard.getIngredients(), recipeCard.getInstructions(), recipeCard.getNotes(), recipeCard.getKeyWords());

        return recipeCard;
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
