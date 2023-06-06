package com.personal.recipe.controller;

import com.personal.recipe.dao.RecipeCardDao;
import com.personal.recipe.model.RecipeCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RecipeCardController {
    @Autowired
    private RecipeCardDao recipeCardDao;


    @RequestMapping(path = "/recipe", method = RequestMethod.GET)
    public RecipeCard getRecipe() {
        return null;
    }

    @RequestMapping(path = "/recipe", method = RequestMethod.POST)
    public RecipeCard addRecipe() {
        return null;
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
