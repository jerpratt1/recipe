package com.personal.recipe.model;

import java.util.List;

public class RecipeCard {
    private String recipeTitle;
    private String recipeDescription;
    private int prepTime;
    private int cookTime;
    private int restTime;
    private int servingSize;
    private String tools;
    private String ingredients;
    private String instructions;
    private String notes;
    private String keyWords;

    public RecipeCard() {

    }

    public RecipeCard(String recipeTitle, String recipeDescription, int prepTime, int cookTime, int restTime, int servingSize, String tools, String ingredients, String instructions, String notes, String keyWords) {
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.restTime = restTime;
        this.servingSize = servingSize;
        this.tools = tools;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.notes = notes;
        this.keyWords = keyWords;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
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

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }
}
