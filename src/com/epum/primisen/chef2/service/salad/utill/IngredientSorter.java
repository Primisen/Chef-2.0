package com.epum.primisen.chef2.service.salad.utill;

import com.epum.primisen.chef2.service.ingredient.comparator.CalorieComparator;
import com.epum.primisen.chef2.service.ingredient.comparator.FitsComparator;
import com.epum.primisen.chef2.service.salad.Salad;

public class IngredientSorter {

    private IngredientSorter() {
    }

    public static void sort(Salad salad, CalorieComparator calorieComparator) {
        salad.getIngredients().sort(calorieComparator);
    }

    public static void sort(Salad salad, FitsComparator fitsComparator) {
        salad.getIngredients().sort(fitsComparator);
    }
}
