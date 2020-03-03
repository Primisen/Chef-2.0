package com.epum.primisen.chef2;

import com.epum.primisen.chef2.controller.recipe.Recipe;
import com.epum.primisen.chef2.controller.recipe.RecipeLogic;
import com.epum.primisen.chef2.dao.file.File;
import com.epum.primisen.chef2.service.ingredient.comparator.CalorieComparator;
import com.epum.primisen.chef2.service.ingredient.comparator.FitsComparator;
import com.epum.primisen.chef2.service.salad.Salad;
import com.epum.primisen.chef2.service.salad.utill.IngredientSorter;
import com.epum.primisen.chef2.view.Printer;

public class Application {

    public static void main(String[] args) {

        Recipe recipe = new Recipe(File.read("D:\\Java\\training november\\monomah.txt"));
        RecipeLogic recipeLogic = new RecipeLogic(recipe);

        Salad salad = new Salad();
        salad.setIngredients(recipeLogic.readRecipe());

        Printer.printSalad(salad);

        IngredientSorter.sort(salad, new CalorieComparator());
        Printer.printSalad(salad);
    }
}
