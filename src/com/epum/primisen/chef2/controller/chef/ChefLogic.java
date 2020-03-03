package com.epum.primisen.chef2.controller.chef;

import com.epum.primisen.chef2.controller.chef.exception.ChefLogicException;
import com.epum.primisen.chef2.service.salad.Salad;
import com.epum.primisen.chef2.service.ingredient.Ingredient;

import java.util.ArrayList;

//в объекте салат проверить наличие всех необхадимых компонентов

public class ChefLogic {

    public Chef chef;

    //ex: chef останется пустой. проверить, пустой chef или нет
    public ChefLogic() {
    }

    public ChefLogic(Chef chef) {
        this.chef = chef;
    }

    public Salad cook() throws ChefLogicException { //ингредиент + специя + заправка != ингредиент

        ArrayList<Ingredient> ingredients = chef.getIngredients();

        if(ingredients == null){
            throw new ChefLogicException("Chef has no ingredients!");
        }

        for (int i = 0; i < ingredients.size(); i++) {

            if(ingredients instanceof IngredientCook){
                ((IngredientCook) ingredients).cook();
            }
        }

        return new Salad(ingredients);
    }
}
