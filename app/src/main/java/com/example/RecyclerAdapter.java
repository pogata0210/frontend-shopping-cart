package com.example;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.frontend_shopping_cart.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>
{

    private List<String> list;

    public RecyclerAdapter(List<String> list){

        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.text_view_layout, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(textView);

        //return null;
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {

        viewHolder.VersionName.setText(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView VersionName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            VersionName = (TextView) itemView;
        }
    }
}