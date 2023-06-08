import axios from "axios";

    const getRecipe = function (){
        return axios.get('http://localhost:9000/recipe') 
     
        }





export default getRecipe;