package com.epum.primisen.chef2.service.salad;

import com.epum.primisen.chef2.service.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Salad {

    private List<Ingredient> ingredients;
    // каллорийность (и прочее )здесь

    public Salad() {
        ingredients = new ArrayList<>();
    }

    //сомнительный конструктор
//    public Salad(List<Ingredient> ingredients) {
//        this.ingredients = ingredients;
//    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
