package com.epum.primisen.chef2.dao;

import com.epum.primisen.chef2.service.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeLogic {

    private Recipe recipe;

    public RecipeLogic(Recipe recipe) {
        this.recipe = recipe; //проверить на null
    }

    //плохой метод
    //лучше написать несколько методов для вытаскивания имени ингредиента, его веса и т.д.
    public List<Ingredient> readRecipe() {

        // \uFEFF - специальный символ в начале текстового файла в кодировке unicode
        String parser = "\uFEFF?([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*);\n?";
        Pattern pattern = Pattern.compile(parser);
        Matcher matcher = pattern.matcher(recipe.getRecipe());

        List<Ingredient> ingredients = new ArrayList<>();

        int i = 0;
        while (matcher.find()) {

            ingredients.get(i).setName(matcher.group(1));
            ingredients.get(i).setWeight(Double.parseDouble(matcher.group(2)));
            ingredients.get(i).setCalorie(Integer.parseInt(matcher.group(3)));
            ingredients.get(i).setCarbohydrates(Double.parseDouble(matcher.group(4)));
            ingredients.get(i).setFits(Double.parseDouble(matcher.group(5)));
            ingredients.get(i).setProteins(Double.parseDouble(matcher.group(6)));

            i++;
        }
        return ingredients;
    }
}
