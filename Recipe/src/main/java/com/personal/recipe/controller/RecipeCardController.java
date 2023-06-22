package com.personal.recipe.controller;

import com.personal.recipe.dao.RecipeCardDao;
import com.personal.recipe.model.RecipeCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class RecipeCardController {
    @Autowired
    private RecipeCardDao recipeCardDao;


    @RequestMapping(path = "/recipe", method = RequestMethod.GET)
    public RecipeCard getRecipe() {
        RecipeCard recipeCard = recipeCardDao.getRecipe();
        return recipeCard;
    }

    @RequestMapping(path = "/box", method = RequestMethod.GET)
    public List <RecipeCard> getAllRecipe() {
        List <RecipeCard> cards = new ArrayList<>();
        cards = recipeCardDao.getAllRecipe();
        return cards;
    }

    @RequestMapping(path = "/recipe", method = RequestMethod.POST)
    public RecipeCard addRecipe(@RequestBody RecipeCard recipeCard) {
        RecipeCard newCard = recipeCardDao.addRecipe(recipeCard);
        return newCard;
    }

    @RequestMapping(path = "/recipe", method = RequestMethod.PUT)
    public RecipeCard updateRecipe() {
        return null;
    }

    @RequestMapping(path = "/recipe", method = RequestMethod.DELETE)
    public RecipeCard deleteRecipe() {
        return null;
    }


}
