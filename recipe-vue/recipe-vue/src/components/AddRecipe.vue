<template>
  <div>
    <div id="add_recipe">
      <label for="title" id="title"
        >Recipe Title: <br /><input
          type="text"
          name="title"
          class="text"
          v-model="recipeCard.recipeTitle"
        />
      </label>
      <label for="description" id="description"
        >Recipe Description: <br /><input
          type="text"
          name="description"
          class="text"
          v-model="recipeCard.recipeDescription"
        />
      </label>
      <label for="prep" id="prep"
        >Prep Time: <br /><input
          type="number"
          name="prep"
          v-model="recipeCard.prepTime"
        />
      </label>
      <label for="cook" id="cook"
        >Cook Time: <br /><input
          type="number"
          name="cook"
          v-model="recipeCard.cookTime"
        />
      </label>
      <label for="rest" id="rest"
        >Rest Time: <br /><input
          type="number"
          name="rest"
          v-model="recipeCard.restTime"
      /></label>
      <label for="serving" id="serving"
        >Serving Size: <br /><input
          type="number"
          name="serving"
          v-model="recipeCard.servingSize"
      /></label>
      <div id="tools">
        <label for="tools"
          >Tools: <br /><input
            type="text"
            name="tools"
            class="short_text"
            v-model="activeTool"
          />
          <button v-on:click="addToArray(activeTool, toolList)">
            Add
          </button></label
        >
        <div v-for="tool in toolList" v-bind:key="tool.id">{{ tool }}</div>
      </div>
      <div id="ingredients">
        <label for="ingredients"
          >Ingredients: <br /><input type="number" />
          <select name="subject" id="subject">
            <option value="" selected="selected">OZ</option>
            <option value="" selected="selected">TSP</option></select
          ><input
            type="text"
            name="ingredients"
            class="text"
            v-model="activeIngredient"
          />
          <button v-on:click="addToArray(activeIngredient, ingredientList)">
            Add
          </button></label
        >
        <div v-for="ingredient in ingredientList" v-bind:key="ingredient.id">
          {{ ingredient }}
        </div>
      </div>
      <div id="instructions">
        <label for="instructions"
          >Instructions: <br /><input
            type="text"
            name="instructions"
            class="text tall"
            v-model="activeInstruction"
          />
          <button v-on:click="addToArray(activeInstruction, instructionList)">
            Add
          </button>
        </label>
        <div v-for="instruction in instructionList" v-bind:key="instruction.id">
          {{ instruction }}
        </div>
      </div>
      <div id="notes">
        <label for="notes"
          >Notes: <br /><input
            type="text"
            name="notes"
            class="text tall"
            v-model="activeNote"
          />
          <button v-on:click="addToArray(activeNote, noteList)">
            Add
          </button></label
        >
        <div v-for="note in noteList" v-bind:key="note.id">{{ note }}</div>
      </div>
      <div id="keywords">
        <label for="keywords"
          >Keywords: <br /><input
            type="text"
            name="keywords"
            class="text"
            v-model="activeKeyWord"
          />
          <button v-on:click="addToArray(activeKeyWord, keyWordList)">
            Add
          </button>
        </label>
        <div v-for="keyWord in keyWordList" v-bind:key="keyWord.id">
          {{ keyWord }}
        </div>
      </div>
      <button id="button" v-on:submit.prevent="submitRecipe">
        Submit Recipe
      </button>
    </div>
  </div>
</template>

<script>
import RecipeService from "../services/RecipeService.js";
export default {
  data() {
    return {
      recipeCard: {
        recipeTitle: "",
        recipeDescription: "",
        prepTime: 0,
        cookTime: 0,
        restTime: 0,
        servingSize: 0,
        tools: "",
        ingredients: "",
        instructions: "",
        notes: "",
        keyWords: "",
      },
      activeTool: "",
      activeIngredient: "",
      activeInstruction: "",
      activeNote: "",
      activeKeyWord: "",
      toolList: [],
      ingredientList: [],
      instructionList: [],
      noteList: [],
      keyWordList: [],
    };
  },
  methods: {
    submitRecipe() {
      RecipeService.addRecipe(this.recipeCard)
        .then((response) => {
          console.log(response.status);
        })
        .catch((error) => {
          console.log(error.response.status);
        });
    },

    addToArray(activeForm, arrayName) {
      arrayName.push(activeForm);
    },
  },
};
</script>

<style scoped>
#title {
  grid-area: title;
  width: 100%;
}

#description {
  grid-area: description;
  width: 100%;
}

#prep {
  grid-area: prep;
  width: 100%;
}

#cook {
  grid-area: cook;
  width: 100%;
}

#rest {
  grid-area: rest;
  width: 100%;
}

#serving {
  grid-area: serving;
  width: 100%;
}

#tools {
  grid-area: tools;
  width: 100%;
}

#ingredients {
  grid-area: ingredients;
  width: 100%;
}

#instructions {
  grid-area: instructions;
  width: 100%;
}

#notes {
  grid-area: notes;
  width: 100%;
}

#keywords {
  grid-area: keywords;
  width: 100%;
}

#button {
  grid-area: button;
  width: 33%;
  justify-self: center;
}

#add_recipe {
  display: grid;
  grid-template-columns: 3fr 3fr 3fr;
  grid-template-rows: auto;
  grid-template-areas:
    "title title x"
    "description description x"
    "prep cook rest"
    "serving tools tools"
    "ingredients ingredients ingredients"
    "instructions instructions instructions"
    "notes notes notes"
    "keywords keywords keywords"
    "button button button";
  background: #282c34;
  height: 100vh;
  max-width: 100%;
  color: white;
}

.text {
  width: 80%;
}

.short_text {
  width: 70%;
}

.tall {
  height: 50px;
}
</style>