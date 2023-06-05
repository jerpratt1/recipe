package com.personal.recipe.model;

import java.awt.*;

public class RecipeCard {
    private String recipeTitle;
    private String recipeImageURL;
    private String recipeDescription;
    private int prepTime;
    private int cookTime;
    private int restTime;
    private List ingredients;
    private List instructions;
    private List notes;

    public RecipeCard(String recipeTitle, String recipeImageURL, String recipeDescription, int prepTime, int cookTime, int restTime, List ingredients, List instructions, List notes) {
        this.recipeTitle = recipeTitle;
        this.recipeImageURL = recipeImageURL;
        this.recipeDescription = recipeDescription;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.restTime = restTime;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.notes = notes;
    }

    public RecipeCard() {

    }


    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public String getRecipeImageURL() {
        return recipeImageURL;
    }

    public void setRecipeImageURL(String recipeImageURL) {
        this.recipeImageURL = recipeImageURL;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public List getIngredients() {
        return ingredients;
    }

    public void setIngredients(List ingredients) {
        this.ingredients = ingredients;
    }

    public List getInstructions() {
        return instructions;
    }

    public void setInstructions(List instructions) {
        this.instructions = instructions;
    }

    public List getNotes() {
        return notes;
    }

    public void setNotes(List notes) {
        this.notes = notes;
    }
}
