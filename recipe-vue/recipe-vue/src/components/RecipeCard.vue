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
          <li>Yield: {{this.recipe.servingSize}}</li>
        </ul>
      </div>
      <div id="main-recipe">
        <hr/>
        <span>Tools: {{this.recipe.tools}} <br/></span>
        <hr/>
        <span>Ingredients: <br/>{{this.recipe.ingredients}}<br/></span>
        <span>Instructions: <br/>{{this.recipe.instructions}}<br/></span>
        <hr/>
        <span>Notes: <br/>{{this.recipe.notes}}<br/></span>
        <span>Keywords: {{this.recipe.keyWords}}</span>
        
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
  background-color: whitesmoke;
  min-height: 90vh;
  min-width: 60%;
  display: flex;
  flex-direction: column;
  font-size: calc(10px + 2vmin);
  color: black;
  border: gray solid 3px;
  border-radius: 30px;
  padding: 10px;
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

ul > li{
  padding: 3px;
  margin: 5px;
  border: gray solid 3px;
  border-radius: 10px;
}
</style>