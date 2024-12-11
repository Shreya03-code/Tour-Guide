package com.example.tourguide.hotel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tourguide.AttractionActivity;
import com.example.tourguide.R;

public class RowHotelActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_row_hotel);

        b1 = findViewById(R.id.back_hotel);
        b2 = findViewById(R.id.but_aaheli);
        b3 = findViewById(R.id.but_anurag);
        b4 = findViewById(R.id.but_geetanjali);
        b5 = findViewById(R.id.but_diamond);
        b6 = findViewById(R.id.but_royal);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHotelActivity.this, HotelActivity.class));
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHotelActivity.this, DetailAaheliActivity.class));
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHotelActivity.this, DetailAnuragActivity.class));
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHotelActivity.this, DetailGeetanjaliActivity.class));
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHotelActivity.this, DetailDiamondActivity.class));
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHotelActivity.this, DetailRoyalPalaceActivity.class));
                finish();
            }
        });


    }
}