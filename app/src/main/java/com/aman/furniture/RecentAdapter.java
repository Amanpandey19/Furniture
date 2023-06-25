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

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.RecyclerviewHolder> {
    private ArrayList<Recent> recents = new ArrayList<>();
    Context context;


    public RecentAdapter(Context context, ArrayList<Recent> recents) {
        this.context           = context;
        this.recents = recents;
    }


    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mRootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recently_viewed_item, parent, false);
        return new RecyclerviewHolder(mRootView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {
        Recent recent = recents.get(position);

        holder.name.setText(recent.getName());
        holder.price.setText(recent.getPrice());
        holder.image.setImageDrawable(recent.getImage());
        holder.recentCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recents.size();
    }


    public static final class RecyclerviewHolder extends RecyclerView.ViewHolder {
        TextView name,price;
        ImageView image;
        CardView recentCard;

        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);

            name                  =   itemView.findViewById(R.id.product_name);
            price                 =   itemView.findViewById(R.id.product_price);
            image                 =   itemView.findViewById(R.id.product_image);
            recentCard            =  itemView.findViewById(R.id.recent_card);

        }

    }

}
