package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Swiggy1Activity extends AppCompatActivity {
    RecyclerView swiggyRv;
    SwiggyItems[]swiggyItems;
    SwiggyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy1);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void initViews() {
        swiggyRv = findViewById(R.id.swiggy_rv);

    }

    private void connectAdapter() {
        swiggyRv.setLayoutManager(new LinearLayoutManager(this));
        swiggyRv.setAdapter(adapter);
    }

    private void setUpAdapter() {
        adapter = new SwiggyAdapter(swiggyItems);
    }

    private void createData() {
        swiggyItems  = new SwiggyItems[1];
        SwiggyItems item1 = new SwiggyItems();
        item1.poster = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item1.item = "Silvia";
        item1.rate = "@machadocomida-1m";
        item1.foodStyle  = "ppl keep saying hot girl summer but i'm just trying to stay out of the humidity\n";
        item1.time = "2";
        item1.discount  = "6";
        swiggyItems[0] = item1;



    }
}