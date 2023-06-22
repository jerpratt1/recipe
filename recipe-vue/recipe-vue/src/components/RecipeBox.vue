<template>
  <div>
    <div id='card' v-for="recipe in recipes" v-bind:key="recipe.id">
      <h1>{{recipe.recipeTitle}}</h1>
      <p>{{recipe.recipeDescription}}</p>
      <p> {{recipe.keyWords}} </p>

    
    
    </div>
    <button v-on:click='populateRecipes'> populate recipes </button>
  </div>
</template>

<script>
import RecipeService from '../services/RecipeService.js'
export default {
  data() {
    return {
      recipes: [],
       recipe: {},
    };
  },

  methods: {
    populateRecipes() {
        RecipeService.getAllRecipe().then((response) =>{
          this.recipes = response.data;
        })
    }
  }
};
</script>

<style>

</style>