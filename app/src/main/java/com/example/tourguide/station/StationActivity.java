package com.example.tourguide.station;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguide.AttractionActivity;
import com.example.tourguide.R;

public class StationActivity extends AppCompatActivity {

    ListView list;

    Button stationback;
    String stations[] = {
            "Kalyani Ghospara",
            "Kalyani Simanta",
            "Kalyani Shilpanchal",
            "Kalyani Main Station",
            "Kanchrapara Station",
    };

    Integer[] imageId = {
            R.drawable.sta1,
            R.drawable.sta2,
            R.drawable.sta3,
            R.drawable.sta4,
            R.drawable.sta5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_station);

        CustomStationList adapter = new CustomStationList(StationActivity.this,stations,imageId);

        list = findViewById(R.id.station_list);
        list.setAdapter(adapter);

        stationback = findViewById(R.id.back_station);
        stationback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StationActivity.this, AttractionActivity.class));
                finish();
            }
        });

    }
}