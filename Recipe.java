package com.example.cdmda.foodwasteapp;

import java.util.HashMap;

public class Recipe {

    HashMap<Food,Integer> recipe;

    public Recipe(){
        this.recipe = new HashMap<>();
    }

    public void addIngredient(Food ingredients,Integer quantity){
        this.recipe.put(ingredients,quantity);
    }

}

