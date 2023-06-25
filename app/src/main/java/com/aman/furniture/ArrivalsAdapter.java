package com.aman.furniture;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArrivalsAdapter extends RecyclerView.Adapter<ArrivalsAdapter.RecyclerviewHolder> {
    private ArrayList<Arrival> arrivals = new ArrayList<>();
    Context context;


    public ArrivalsAdapter(Context context, ArrayList<Arrival> arrivals) {
        this.context           = context;
        this.arrivals = arrivals;
    }


    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mRootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.arrival_item, parent, false);
        return new RecyclerviewHolder(mRootView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {
        Arrival arrival = arrivals.get(position);

        holder.name.setText(arrival.getName());
        holder.price.setText(arrival.getPrice());
        holder.image.setImageDrawable(arrival.getImage());

        holder.arrivalCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductActivity.class);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrivals.size();
    }


    public static final class RecyclerviewHolder extends RecyclerView.ViewHolder {
        TextView name,price;
        CheckBox isFav;
        ImageView image;
        CardView arrivalCard;

        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);

            name                   =   itemView.findViewById(R.id.product_name);
            price               =   itemView.findViewById(R.id.product_price);
            image                 =   itemView.findViewById(R.id.product_image);
            isFav                   =   itemView.findViewById(R.id.fav_icon_cart);
            arrivalCard             =   itemView.findViewById(R.id.arrival_card);

        }

    }

}
