package com.example.tourguide.station;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguide.R;
import com.example.tourguide.hospital.DetailHospitalActivity;

public class CustomStationList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] station;
    private final Integer[] imageId;

    public CustomStationList(Activity context,String[] station,Integer[] imageId){

        super(context, R.layout.custom_listview,station);
        this.context = context;
        this.station = station;
        this.imageId = imageId;

    }

    @Override
    public View getView (int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_listview,null,true);
        TextView txtTitle = rowView.findViewById(R.id.txt);
        ImageView imageView = rowView.findViewById(R.id.img);

        txtTitle.setText(station[position]);
        imageView.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RowStationActivity.class);
                intent.putExtra("ksta",station[position]);
                context.startActivity(intent);
            }
        });

        return rowView;
    }

}
