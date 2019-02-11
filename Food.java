package com.example.cdmda.foodwasteapp;

//import android.widget.DatePicker;

import java.util.Date;

public class Food {

    Date calendar;

    String Name;
    int Quantity; //maybe not int
    //calendar ExpDate;


    public Food(String name, int quantity, int year, int month, int day){

        this.Name = name;
        //this.calendar = new GregorianCalendar(year, month, day);
        this.calendar = new Date(year, month, day);
        this.Quantity = quantity;

    }

    public void setName(String name) {
        Name = name;
    }

    public Date getExpDate() {
        return calendar;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getName() {


        return Name;
    }
}

