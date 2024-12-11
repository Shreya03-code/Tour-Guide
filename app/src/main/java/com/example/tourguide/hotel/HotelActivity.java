package com.example.tourguide.hotel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguide.AttractionActivity;
import com.example.tourguide.R;
import com.example.tourguide.hospital.CustomHospitalList;

public class HotelActivity extends AppCompatActivity {

    ListView list;

    Button hotelback;
    String hotels[] = {
            "Aaheli Guest House",
            "Anurag Guest House",
            "Hotel Geetanjali Delux",
            "Diamond Guest House",
            "Hotel Royal Palace",
    };

    Integer[] imageId = {
            R.drawable.hotel1,
            R.drawable.hotel2,
            R.drawable.hotel3,
            R.drawable.hotel4,
            R.drawable.hotel5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hotel);

        CustomHotelList adapter = new CustomHotelList(HotelActivity.this,hotels,imageId);

        list = findViewById(R.id.hotel_list);
        list.setAdapter(adapter);

        hotelback = findViewById(R.id.back_hotel);
        hotelback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HotelActivity.this, AttractionActivity.class));
                finish();
            }
        });

    }
}