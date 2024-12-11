package com.example.tourguide.atm;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguide.R;

public class CustomAtmList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] atm;
    private final Integer[] imageId;

    public CustomAtmList(Activity context,String[] atm,Integer[] imageId){

        super(context, R.layout.custom_listview,atm);
        this.context = context;
        this.atm = atm;
        this.imageId = imageId;

    }

    @Override
    public View getView (int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_listview,null,true);
        TextView txtTitle = rowView.findViewById(R.id.txt);
        ImageView imageView = rowView.findViewById(R.id.img);

        txtTitle.setText(atm[position]);
        imageView.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RowAtmActivity.class);
                intent.putExtra("katm",atm[position]);
                context.startActivity(intent);
            }
        });

        return rowView;
    }

}
