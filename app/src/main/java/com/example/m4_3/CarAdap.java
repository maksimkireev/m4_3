package com.example.m4_3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdap extends RecyclerView.Adapter<CarAdap.ViewHolder>{


    private final List<Car> cars;
    private final LayoutInflater inflater;


    public CarAdap(List<Car> cars, Context context ) {
        this.cars = cars;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.resImag.setImageResource(car.getResImage());
        holder.brend.setText(car.getBrand());
        holder.description.setText(car.getDescription());
        holder.market_price.setText(car.getMarket_price());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView resImag;
        final TextView brend, description, market_price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            resImag = itemView.findViewById(R.id.imageView);

            brend = itemView.findViewById(R.id.brend);
            description = itemView.findViewById(R.id.description);
            market_price = itemView.findViewById(R.id.market_price);
        }
    }
}