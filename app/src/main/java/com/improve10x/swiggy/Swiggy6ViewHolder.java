package com.improve10x.swiggy;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Swiggy6ViewHolder extends RecyclerView.ViewHolder {
    public TextView itemTxt;
    public TextView ratingTxt;
    public TextView detailsTxt;
    public TextView timeTxt;
    public TextView discountTxt;
    public ImageView posterIv;

    public Swiggy6ViewHolder(@NonNull View itemView) {
        super(itemView);
        itemTxt = itemView.findViewById(R.id.item_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        detailsTxt = itemView.findViewById(R.id.details_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        discountTxt = itemView.findViewById(R.id.discount_txt);
        posterIv = itemView.findViewById(R.id.poster_iv);
    }
}
