package com.example.tourguide.hotel;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguide.R;

public class CustomHotelList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] hotel;
    private final Integer[] imageId;

    public CustomHotelList(Activity context, String[] hotel, Integer[] imageId){

        super(context, R.layout.custom_listview,hotel);
        this.context = context;
        this.hotel = hotel;
        this.imageId = imageId;

    }

    @Override
    public View getView (int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_listview,null,true);
        TextView txtTitle = rowView.findViewById(R.id.txt);
        ImageView imageView = rowView.findViewById(R.id.img);

        txtTitle.setText(hotel[position]);
        imageView.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RowHotelActivity.class);
                intent.putExtra("khot",hotel[position]);
                context.startActivity(intent);
            }
        });

        return rowView;
    }

}
