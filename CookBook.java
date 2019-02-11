package com.example.cdmda.foodwasteapp;

import java.util.ArrayList;
import java.util.List;

public class CookBook{

    List<Recipe> cookBook;

    public CookBook(){

        cookBook = new ArrayList<>();
    }

    public void addRecipe(Recipe r){

        this.cookBook.add(r);

    }
}
