package com.improve10x.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyAdapter extends RecyclerView.Adapter<SwiggyViewHolder> {
    SwiggyItems[] items;
public SwiggyAdapter(SwiggyItems[]swiggyItems){
    items = swiggyItems;
}
    @NonNull
    @Override
    public SwiggyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy_item,parent,false);
        SwiggyViewHolder viewHolder = new SwiggyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyViewHolder holder, int position) {
        SwiggyItems item1 =  items[position];
        holder.titleTxt.setText(item1.title);
        holder.descriptionTxt.setText(item1.description);
        holder.silverTxt.setText(item1.silver);
        holder.chatTxt.setText(item1.chat);
        holder.rotationTxt.setText(item1.rotation);
        holder.favoriteTxt.setText(item1.favorite);
        Picasso.get().load(item1.photo).into(holder.photoIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
