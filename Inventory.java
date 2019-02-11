package com.example.cdmda.foodwasteapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

//import java.lang.Comparable<? super Food>;
public class Inventory {

    String ID;
    String Name;
    ArrayList<Food> listOfFood = new ArrayList<>();

    public Inventory(String id, String name, ArrayList<Food> foodList) {
        //all food
        this.ID = id;
        this.Name = name;
        this.listOfFood = foodList;

    }

    public void inputFood(Food food) {

        this.listOfFood.add(food);
        sortInventory();
    }

    public void sortInventory(){

        ArrayList<Date> dates = new ArrayList<>();
        //this.listOfFood.sort
        for (Food aListOfFood : listOfFood) {
            dates.add(aListOfFood.getExpDate());
        }

        Collections.sort(dates);

        ArrayList<Food> newFood = new ArrayList<>();

        for(Date d : dates) {

            for(Food f : listOfFood){
                if(f.getExpDate() == d){
                    newFood.add(f);
                }
            }

            //System.out.println(d.toString());
        }

        this.listOfFood = newFood;

    }

   /*public string eatFood() {
       Inventory.remove(food)
   }*/
}

