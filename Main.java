package com.example.cdmda.foodwasteapp;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    Recipe r;

    public Main(){


    }

    public String[] exampleInventory(){

        Food bigTomatoes = new Food("Big Tomatoes", 6, 2019, 1,9);
        Food eggs = new Food("Eggs", 6, 2019,3,19);
        Food chickenBreasts = new Food("Chicken Breasts", 4, 2019, 1, 18);
        Food milk = new Food("Milk", 1, 2019,3,2);
        Food butter = new Food("Butter", 1, 2020, 0, 3);
        Food olives = new Food("Olives", 20, 2019, 3, 14);
        Food rPeppers = new Food("Red Peppers", 2, 2019, 1, 27);
        Food cake = new Food("Cake", 1, 2019, 4, 21);

        ArrayList<Food> fridgeFood = new ArrayList<>();

        fridgeFood.add(bigTomatoes);
        fridgeFood.add(eggs);
        fridgeFood.add(milk);
        fridgeFood.add(chickenBreasts);
        fridgeFood.add(butter);
        fridgeFood.add(olives);
        fridgeFood.add(rPeppers);
        fridgeFood.add(cake);


        Inventory inventory1 = new Inventory("afa12", "christian" , fridgeFood);
        ArrayList<Date> dates = new ArrayList<>();

        for(int i=0; i<inventory1.listOfFood.size();i++){
            dates.add(inventory1.listOfFood.get(i).getExpDate());
        }
        for(Date d : dates) {
            System.out.println(d.toString());
        }
        inventory1.sortInventory();
        System.out.println();

        dates = new ArrayList<Date>();
        String[] names = new String[inventory1.listOfFood.size()];

        for(int i=0; i<inventory1.listOfFood.size();i++){
            dates.add(inventory1.listOfFood.get(i).getExpDate());
            names[i] = inventory1.listOfFood.get(i).getName();
        }

        /*for(Date d : dates) {
            System.out.println(d.toString());
        }

        inventory1.inputFood(chickenBreasts);

        for(Food f : inventory1.listOfFood){
            System.out.println(f.getName());
        }

        r = new Recipe();
        r.addIngredient(chickenBreasts, 3);
        r.addIngredient(eggs, 2);

        for(Food f: r.recipe.keySet()){
            System.out.println(f.getName());
        }*/

        return names;
    }

    public String[] returnDates(){

        Food bigTomatoes = new Food("Big Tomatoes", 6, 2019, 1,9);
        Food eggs = new Food("Eggs", 6, 2019,3,19);
        Food chickenBreasts = new Food("Chicken Breasts", 4, 2019, 1, 18);
        Food milk = new Food("Milk", 1, 2019,3,2);
        Food butter = new Food("Butter", 1, 2020, 0, 3);
        Food olives = new Food("Olives", 20, 2019, 3, 14);
        Food rPeppers = new Food("Red Peppers", 2, 2019, 1, 27);
        Food cake = new Food("Cake", 1, 2019, 4, 21);

        ArrayList<Food> fridgeFood = new ArrayList<>();

        fridgeFood.add(bigTomatoes);
        fridgeFood.add(eggs);
        fridgeFood.add(milk);
        fridgeFood.add(chickenBreasts);
        fridgeFood.add(butter);
        fridgeFood.add(olives);
        fridgeFood.add(rPeppers);
        fridgeFood.add(cake);


        Inventory inventory1 = new Inventory("afa12", "christian" , fridgeFood);
        ArrayList<Date> dates = new ArrayList<>();
        String[] expDates = new String[inventory1.listOfFood.size()];

        for(int i=0; i<inventory1.listOfFood.size();i++){
            dates.add(inventory1.listOfFood.get(i).getExpDate());
            expDates[i] = inventory1.listOfFood.get(i).getExpDate().toString();
        }

        return expDates;
    }


//make new inventory? from user input

    /*public static void main(String[] args){

        Main m = new Main();
        CookBook cookBook = new CookBook();

        Inventory in = m.exampleInventory();


        cookBook.addRecipe(m.r);

        //for loop through list
        //in.listOfFood.
        //new food
        //if ...


    }*/


}


