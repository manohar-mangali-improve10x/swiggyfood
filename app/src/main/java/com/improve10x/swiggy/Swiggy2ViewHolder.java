package com.improve10x.swiggy;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Swiggy2ViewHolder extends RecyclerView.ViewHolder {
    public TextView titleTxt;
    public TextView desTxt;
    public TextView costTxt;
    public TextView countTxt;



    public Swiggy2ViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTxt = itemView.findViewById(R.id.title_txt);
        desTxt = itemView.findViewById(R.id.dise_txt);
        costTxt = itemView.findViewById(R.id.price_txt);
        countTxt = itemView.findViewById(R.id.count_txt);
    }
}
