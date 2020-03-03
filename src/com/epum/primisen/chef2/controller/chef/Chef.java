package com.epum.primisen.chef2.controller.chef;

import com.epum.primisen.chef2.dao.Recipe;
import com.epum.primisen.chef2.dao.RecipeLogic;
import com.epum.primisen.chef2.service.ingredient.Ingredient;

import java.io.IOException;
import java.util.ArrayList;

//что если сделать так, чтобы шеф гоовил, проверяя null и прчее?
public class Chef {

    private ArrayList<Ingredient> ingredients;

    public Chef(String recipe) throws IOException {
        Recipe recipeReader = new Recipe(recipe);
        RecipeLogic recipeLogic = new RecipeLogic(recipeReader);
        this.ingredients = recipeLogic.readRecipe();
    }

    public Chef(ArrayList<Ingredient> ingredients){
        this.ingredients = ingredients;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
