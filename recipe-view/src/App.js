import './App.css';
import React from 'react'
import AddRecipe from './components/addRecipe'
import RecipeCard from './components/recipeCard';
import uuidv4 from 'uuid/v4';

function App() {
  return (
    <main>
      <AddRecipe />
      <RecipeCard/>
      
    </main>
    
  );
}

export default App;
