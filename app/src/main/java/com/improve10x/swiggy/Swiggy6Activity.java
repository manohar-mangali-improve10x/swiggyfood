package com.improve10x.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Swiggy6Activity extends AppCompatActivity {
    RecyclerView swiggy6Rv;
    Swiggy6Items[] swiggy6Items;
    Swiggy6Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy6);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void initViews() {
        swiggy6Rv = findViewById(R.id.swiggy6_rv);

    }

    private void connectAdapter() {
        swiggy6Rv.setLayoutManager(new GridLayoutManager(this,3));
        swiggy6Rv.setAdapter(adapter);
    }

    private void setUpAdapter() {
        adapter = new Swiggy6Adapter(swiggy6Items);
    }

    private void createData() {
        swiggy6Items  = new Swiggy6Items[9];
        Swiggy6Items item1 = new Swiggy6Items();
        item1.poster = "https://i.pinimg.com/236x/15/e7/c2/15e7c2ae902d020f22a75227cb30efa1.jpg?nii=t";
        item1.item = "Aasife Biriyani";
        item1.rating = "4.5";
        item1.details  = "Biriyani Tandoori & Chicken";
        item1.time = "12min";
        item1.discount  = "40%";
        swiggy6Items[0] = item1;

        Swiggy6Items item2 = new Swiggy6Items();
        item2.poster = "https://indianbusinesscanada.com/admin/uploads/2020/08/08/punjabi-aloo-bedmi-puri-69367-1-682.jpeg";
        item2.item = "Akshaya pure";
        item2.rating = "4.4";
        item2.details  = "South Indian";
        item2.time = "12min";
        item2.discount  = "Veg";
        swiggy6Items[1] = item2;

        Swiggy6Items item3 = new Swiggy6Items();
        item3.poster = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item3.item = "Aj Ajwain";
        item3.rating = "4.3";
        item3.details  = "ppl keep sa";
        item3.time = "12min";
        swiggy6Items[2] = item3;

        Swiggy6Items item4 = new Swiggy6Items();
        item4.poster = "https://s3-media0.fl.yelpcdn.com/bphoto/f8oiQXCXOc6h5E9TaI6Y-Q/258s.jpg";
        item4.item = "Anjappar";
        item4.rating = "4.2";
        item4.details  = "Chinese Tandoori";
        item4.time = "12min";
        swiggy6Items[3] = item4;

        Swiggy6Items item5 = new Swiggy6Items();
        item5.poster = "https://i.pinimg.com/236x/45/64/ab/4564abb1f916c9da2a3a732b4aa9f998.jpg?nii=t";
        item5.item = "Cakes & Berrys";
        item5.rating = "4.6";
        item5.details  = "Cakes Sweets";
        item5.time = "12min";
        item5.discount  = "-20%";
        swiggy6Items[4] = item5;

        Swiggy6Items item6 = new Swiggy6Items();
        item6.poster = "https://th.bing.com/th/id/R.3cc7c637cf798c3af0a1aea38534581e?rik=zr6M6vJmHbvA6w&riu=http%3a%2f%2famracatering.com%2ffood1.jpg&ehk=GtdrHeyJxL8X0Yq7ojAq9oQlYIiXRcykYq4kNEd6LPY%3d&risl=&pid=ImgRaw&r=0";
        item6.item = "Copper Chicken";
        item6.rating = "4.0";
        item6.details  = "Chettinadu Chicken";
        item6.time = "12min";
        item6.discount  = "10%";
        swiggy6Items[5] = item6;

        Swiggy6Items item7 = new Swiggy6Items();
        item7.poster = "https://indianbusinesscanada.com/admin/uploads/2020/08/08/punjabi-aloo-bedmi-puri-69367-1-682.jpeg";
        item7.item = "Silvia";
        item7.rating = "4.1";
        item7.details  = "ppl keep sa";
        item7.time = "12min";
        item7.discount  = "40%";
        swiggy6Items[6] = item7;

        Swiggy6Items item8 = new Swiggy6Items();
        item8.poster = "https://indianbusinesscanada.com/admin/uploads/2020/08/08/punjabi-aloo-bedmi-puri-69367-1-682.jpeg";
        item8.item = "Silvia";
        item8.rating = "4.5";
        item8.details  = "ppl keep sa";
        item8.time = "12min";
        item8.discount  = "40%";
        swiggy6Items[7] = item8;

        Swiggy6Items item9 = new Swiggy6Items();
        item9.poster = "https://indianbusinesscanada.com/admin/uploads/2020/08/08/punjabi-aloo-bedmi-puri-69367-1-682.jpeg";
        item9.item = "Silvia";
        item9.rating = "4.5";
        item9.details  = "ppl keep sa";
        item9.time = "12min";
        item9.discount  = "40%";
        swiggy6Items[8] = item9;


    }
}