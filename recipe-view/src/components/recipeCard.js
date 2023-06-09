import { recipeCard, testCard } from '../Data';
import getRecipe from '../RecipeService'

function RecipeCard( ) {
    return (
        <main>
            <div>
                <h1> {testCard.recipeTitle} </h1>
                <h2>{recipeCard.recipeDescription} </h2>
                <img href={recipeCard.recipeImageURL}  alt='test'/>
                <div>
                    <ul className = "no">
                    <li>Prep Time: {recipeCard.prepTime} minutes</li>
                    <li>Cook Time: {recipeCard.cookTime} minutes</li>
                    <li>Rest Time: {recipeCard.restTime} minutes</li>
                    <li>Yield: {recipeCard.servingSize} servings</li>
                    </ul>
                </div>
                {recipeCard.tools}
                {recipeCard.ingredients}
                {recipeCard.instructions}
                {recipeCard.notes}
            </div>
            <button onClick={populateRecipe}> Populate Recipe</button>
        </main>
    );
}

function populateRecipe() {
    getRecipe().then(response => {
        testCard.recipeTitle = response.data.recipeTitle;
        console.log('please work')
    })
}




export default RecipeCard;