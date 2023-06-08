import { recipeCard, GetRecipe } from '../Data';

function RecipeCard() {
    return (
        <main>
            <div>
                <h1> {recipeCard.recipeTitle} </h1>
                <h2>{recipeCard.recipeDescription} </h2>
                <img href={recipeCard.recipeImageURL} alt='test'/>
                <div>
                    <ul class = "no">
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
            <button onClick={GetRecipe}> Populate Recipe</button>
        </main>
    );
}

export default RecipeCard;