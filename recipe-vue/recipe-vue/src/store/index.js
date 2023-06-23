import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    recipeToSubmit: {
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
    }



  },
  getters: {
  },
  mutations: {
    SET_TITLE(title){
      this.state.recipeToSubmit.recipeTitle = title;
    },

    SET_DESCRIPTION(description){
      this.state.recipeToSubmit.recipeDescription = description;
    },

    SET_KEYWORDS(keyWords){
      this.state.recipeToSubmit.keyWords = keyWords;
    },

    SET_PREP(prepTime){
      this.state.recipeToSubmit.prepTime = prepTime;
    },
    
    SET_COOK(cookTime){
      this.state.recipeToSubmit.cookTime = cookTime;
    },
    
    SET_REST(restTime){
      this.state.recipeToSubmit.restTime = restTime;
    },
    
    SET_SERVING(servingSize){
      this.state.recipeToSubmit.servingSize = servingSize;
    },


  },
  actions: {
  },
  modules: {
  }
})
