package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class Swiggy6Adapter extends RecyclerView.Adapter<Swiggy6ViewHolder> {
    Swiggy6Items[] items;
    public Swiggy6Adapter(Swiggy6Items[]swiggy6Items){
        items = swiggy6Items;
    }
    @NonNull
    @Override
    public Swiggy6ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy6_items,parent,false);
        Swiggy6ViewHolder viewHolder = new Swiggy6ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Swiggy6ViewHolder holder, int position) {
        Swiggy6Items item1 =  items[position];
        holder.itemTxt.setText(item1.item);
        holder.ratingTxt.setText(item1.rating);
        holder.detailsTxt.setText(item1.details);
        holder.timeTxt.setText(item1.time);
        holder.discountTxt.setText(item1.discount);
        Picasso.get().load(item1.poster).into(holder.posterIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
