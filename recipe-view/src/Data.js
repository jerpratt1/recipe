import axios from "axios";
import { useState, useEffect } from 'react';

export const recipeCard =
{
    recipeTitle: "test title",
    recipeImageURL: "testurl.com",
    recipeDescription: "test description",
    prepTime: 1,
    cookTime: 1,
    restTime: 1,
    servingSize: 1,
    tools: "test tools",
    ingredients: "test ingredients",
    instructions: "test instructions",
    notes: "test notes",
    keyWords: "test keywords"
}

export const GetRecipe = () => {
    const [posts, setPosts] = useState([]);

   useEffect(() => {
      axios
         .get('http://localhost:9000/recipe')
         .then((response) => {
            setPosts(response.data);
         })
         .catch((err) => {
            console.log(err);
         });
   }, []);


    return posts;
}