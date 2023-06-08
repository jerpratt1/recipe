import axios from "axios";

export default {
    getRecipe(){
        return axios.get('http://localhost:9000/recipe');
    }



}