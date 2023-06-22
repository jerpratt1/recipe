import axios from "axios";

const BASE_URL = 'http://localhost:9000/recipe'

export default {
    getRecipe(){
        return axios.get(BASE_URL);
    },

    getAllRecipe(){
        return axios.get('http://localhost:9000/box')
    },

    addRecipe(recipeCard){
        return axios.post(BASE_URL, recipeCard)
    }



}