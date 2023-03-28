package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Swiggy2Activity extends AppCompatActivity {
    RecyclerView swiggy2Rv;
    Swiggy2Adapter adapter;
    Swiggy2Items[] swiggy2Items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy2);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void initViews() {
        swiggy2Rv = findViewById(R.id.swiggy2_rv);

    }

    private void connectAdapter() {
        swiggy2Rv.setLayoutManager(new LinearLayoutManager(this));
        swiggy2Rv.setAdapter(adapter);
    }

    private void setUpAdapter() {
        adapter = new Swiggy2Adapter(swiggy2Items);
    }

    private void createData() {
        swiggy2Items = new Swiggy2Items[5];
        Swiggy2Items item1 = new Swiggy2Items();
        item1.title = "Shawarma Roll";
        item1.descreption = "Aasife Meat  cut into thin slices and stuffed in Kuboos";
        item1.cost = "410";
        item1.count  = "1";
        swiggy2Items[0] = item1;

        Swiggy2Items item2 = new Swiggy2Items();
        item2.title = "Shawarma Plate ";
        item2.descreption = "Aasife Meat  cut into thin slices and stuffed in Kuboos";
        item2.cost = "410";
        item2.count  = "1";
        swiggy2Items[1] = item2;

        Swiggy2Items item3 = new Swiggy2Items();
        item3.title = "Shawarma Plate ";
        item3.descreption = "Aasife Meat  cut into thin slices and stuffed in Kuboos";
        item3.cost = "410";
        item3.count  = "1";
        swiggy2Items[2] = item3;

        Swiggy2Items item4 = new Swiggy2Items();
        item4.title = "Shawarma Plate ";
        item4.descreption = "Aasife Meat  cut into thin slices and stuffed in Kuboos";
        item4.cost = "410";
        item4.count  = "1";
        swiggy2Items[3] = item4;

        Swiggy2Items item5 = new Swiggy2Items();
        item5.title = "Shawarma Plate ";
        item5.descreption = "Aasife Meat  cut into thin slices and stuffed in Kuboos";
        item5.cost = "410";
        item5.count  = "1";
        swiggy2Items[4] = item5;



    }
}