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


  },
  actions: {
  },
  modules: {
  }
})
