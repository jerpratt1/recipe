<template>
  <div id='main'>
    home recipe
    <div id="recipe-card">
      <div id="top">
        <h1>{{this.recipe.recipeTitle}}</h1>
        <h2>{{this.recipe.recipeDescription}}</h2>
      </div>
      <div id="info">
        <ul>
          <li>Prep Time: {{this.recipe.prepTime}}</li>
          <li>Cook Time: {{this.recipe.cookTime}}</li>
          <li>Rest Time: {{this.recipe.restTime}}</li>
          <li>Yield {{this.recipe.servingSize}}</li>
        </ul>
      </div>
      <div id="main-recipe">
        <span>{{this.recipe.tools}}</span>
        <span>{{this.recipe.ingredients}}</span>
        <span>{{this.recipe.instructions}}</span>
        <span>{{this.recipe.notes}}</span>
        <span>{{this.recipe.keyWords}}</span>
      </div>
    </div>
    <button v-on:click='populateRecipe'> populate recipe </button>
  </div>
</template>

<script>
import RecipeService from '../services/RecipeService.js'
export default {
  data() {
    return {
      recipe: {
        recipeTitle: "",
        recipeDescription: "",
        prepTime: "",
        cookTime: "",
        restTime: "",
        servingSize: "",
        tools: "",
        ingredients: "",
        instructions: "",
        notes: "",
        keyWords: "",
      },
    };
  },

  methods: {
    populateRecipe() {
        RecipeService.getRecipe().then((response) =>{
            this.recipe.recipeTitle = response.data.recipeTitle;
            this.recipe.recipeDescription = response.data.recipeDescription;
            this.recipe.prepTime = response.data.prepTime;
            this.recipe.cookTime = response.data.cookTime;
            this.recipe.restTime = response.data.restTime;
            this.recipe.servingSize = response.data.servingSize;
            this.recipe.tools = response.data.tools;
            this.recipe.ingredients = response.data.ingredients;
            this.recipe.instructions = response.data.instructions;
            this.recipe.notes = response.data.notes;
        })
    }
  }
};
</script>

<style scoped>
#recipe-card{
  background-color: #282c34;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  font-size: calc(10px + 2vmin);
  color: white;
}

#main{
  background-color: #282c34;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  font-size: calc(10px + 2vmin);
  color: white;
}

#info > ul{
  display: flex;
  flex-direction: row;
  list-style-type: none;
}

#info > li{
  padding: 3px;
  margin-left: 3px;
  border: gray solid 3px;
}
</style>