package com.myapplicationdev.android.ourndpsongs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Island> islands;

    public CustomAdapter(Context context, int resource, ArrayList<Island> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.islands = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvDesc = rowView.findViewById(R.id.tvDesc);
        //TextView tvStars = rowView.findViewById(R.id.tvStars);
        TextView tvArea = rowView.findViewById(R.id.tvArea);
        RatingBar ratingBar = rowView.findViewById(R.id.ratingBar);
        ImageView imageView = rowView.findViewById(R.id.imageView);

        // Obtain the Android Version information based on the position
        Island currentIsland = islands.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(currentIsland.getTitle());
        tvDesc.setText(currentIsland.getDescription());
        String stars = "";
        for(int i = 0; i < currentIsland.getStars(); i++){
            stars += " * ";
        }
        //tvStars.setText(stars);

        ratingBar.setRating(currentIsland.getStars());

        tvArea.setText(currentIsland.getArea() + "");

        if (currentIsland.getArea() > 4) {
            imageView.setImageResource(R.drawable.large);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return rowView;
    }

}
