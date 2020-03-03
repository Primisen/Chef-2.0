package com.epum.primisen.chef2.service.salad;

import com.epum.primisen.chef2.service.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Salad {

    private List<Ingredient> ingredients;

    public Salad() {
        ingredients = new ArrayList<>();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Ingredient ingredient : ingredients){
            sb.append(ingredient.getName()).append(" | ");
        }
        return sb.toString();
    }
}
