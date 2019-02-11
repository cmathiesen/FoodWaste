package com.example.cdmda.foodwasteapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListPage extends AppCompatActivity {
    ListView lv;
    ArrayAdapter adapter;

    ListView lv2;
    ArrayAdapter adapter2;

    Main test = new Main();
    String[] foods = test.exampleInventory();
    String[] dates = test.returnDates();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        lv = (ListView) findViewById(R.id.list);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, foods);
        lv.setAdapter(adapter);

        lv2 = (ListView) findViewById(R.id.list2);
        adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dates);
        lv2.setAdapter(adapter2);


    }
}
