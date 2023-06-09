import axios from "axios";

const BASE_URL = 'http://localhost:9000/recipe'

export default {
    getRecipe(){
        return axios.get(BASE_URL);
    },

    addRecipe(recipeCard){
        return axios.post(BASE_URL, recipeCard)
    }



}