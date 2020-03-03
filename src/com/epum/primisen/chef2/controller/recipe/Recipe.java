package com.epum.primisen.chef2.controller.recipe;

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

    @Override
    public int hashCode() {
        return recipe.hashCode();
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        } else {
            Recipe recipe = (Recipe) object;
            return this.recipe.equals(recipe.getRecipe());
        }
    }

    @Override
    public String toString() {
        return recipe;
    }

}
