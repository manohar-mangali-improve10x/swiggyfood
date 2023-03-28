package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class Swiggy2Adapter extends RecyclerView.Adapter<Swiggy2ViewHolder> {
    Swiggy2Items[] items;
    public Swiggy2Adapter(Swiggy2Items[]swiggy2Items){
        items = swiggy2Items;
    }
    @NonNull
    @Override
    public Swiggy2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy2items,parent,false);
        Swiggy2ViewHolder viewHolder = new Swiggy2ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Swiggy2ViewHolder holder, int position) {
        Swiggy2Items item1 =  items[position];
        holder.titleTxt.setText(item1.title);
        holder.desTxt.setText(item1.descreption);
        holder.costTxt.setText(item1.cost);
        holder.countTxt.setText(item1.count);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
