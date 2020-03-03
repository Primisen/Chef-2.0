package com.epum.primisen.chef2.dao;

//переопределить equals, hashcode, tostring
public class Recipe {

    private String recipe;

    public Recipe(String recipe) {
        this.recipe = recipe;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

}
