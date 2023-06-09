<template>
  <div>
    <form id='add_recipe'>
      <label for="title" id="title">Recipe Title: <br/><input type="text" name="title" class="text" v-model="recipeCard.recipeTitle"> </label>
      <label for="description" id="description">Recipe Description: <br/><input type="text" name="description" class="text" v-model="recipeCard.recipeDescription"> </label>
      <label for="image" id="image">Image: <br/><input type="file" name="image" > </label>
      <label for="prep" id="prep">Prep Time: <br/><input type="number" name="prep" v-model="recipeCard.prepTime"> </label>
      <label for="cook" id="cook">Cook Time: <br/><input type="number" name="cook" v-model="recipeCard.cookTime"> </label>
      <label for="rest" id="rest">Rest Time: <br/><input type="number" name="rest" v-model="recipeCard.restTime"></label>
      <label for="serving" id="serving">Serving Size: <br/><input type="number" name="serving" v-model="recipeCard.servingSize"></label>
      <label for="tools" id="tools">Tools: <br/><input type="text" name="tools" class="short_text" v-model="recipeCard.tools"> <button> Add </button></label>
      <label for="ingredients" id="ingredients">Ingredients: <br/><input type="text" name="ingredients" class="text" v-model="recipeCard.ingredients"> <button> Add </button></label>
      <label for="instructions" id="instructions">Instructions: <br/><input type="text" name="instructions" class="text tall" v-model="recipeCard.instructions"> <button> Add </button> </label>
      <label for="notes" id="notes">Notes: <br/><input type="text" name="notes" class="text tall" v-model="recipeCard.notes"> <button> Add </button></label>
      <label for="keywords" id="keywords">Keywords: <br/><input type="text" name="keywords" class="text" v-model="recipeCard.keyWords"> <button> Add </button> </label>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      recipeCard: {
        recipeTitle: "",
        recipeImageURL: "",
        recipeDescription: "",
        prepTime: 0,
        cookTime: 0,
        restTime: 0,
        servingSize: 0,
        tools: [],
        ingredients: [],
        instructions: [],
        notes: [],
        keyWords: [],
      },
    }
  },

}
</script>

<style scoped>
#title{
  grid-area: title;
  width: 100%
}

#description{
  grid-area: description;
  width: 100%
}

#image{
  grid-area: image;
}

#prep{
  grid-area: prep;
  width: 100%
}

#cook{
  grid-area: cook;
  width: 100%
}

#rest{
  grid-area: rest;
  width: 100%
}

#serving{
  grid-area: serving;
  width: 100%
}

#tools{
  grid-area: tools;
  width: 100%
}

#ingredients{
  grid-area: ingredients;
  width: 100%
}

#instructions{
  grid-area: instructions;
  width: 100%
}

#notes{
  grid-area: notes;
  width: 100%
}

#keywords{
  grid-area: keywords;
  width: 100%
}



#add_recipe{
display: grid;
grid-template-columns: 3fr 3fr 3fr;
grid-template-rows: auto;
grid-template-areas:
 "title title image"
 "description description image"
 "prep cook rest"
 "serving tools tools"
 "ingredients ingredients ingredients"
 "instructions instructions instructions"
 "notes notes notes"
 "keywords keywords keywords"
;
}

.text{
  width: 80%;
}

.short_text{
  width: 70%;
}

.tall{
  height: 50px;
}
</style>