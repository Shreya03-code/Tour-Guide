package com.example.tourguide.food;

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

public class RowFoodActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_row_food);

        b1 = findViewById(R.id.back_food);
        b2 = findViewById(R.id.but_dhakeswari);
        b3 = findViewById(R.id.but_letseat);
        b4 = findViewById(R.id.but_rolla);
        b5 = findViewById(R.id.but_royalhut);
        b6 = findViewById(R.id.but_shubham);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFoodActivity.this, FoodActivity.class));
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFoodActivity.this, DetailsDhakeswaripalaceActivity.class));
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFoodActivity.this, DetailsLetseatActivity.class));
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFoodActivity.this, DetailsRollacostaActivity.class));
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFoodActivity.this, DetailsRoyalhutActivity.class));
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFoodActivity.this, DetailsShubhamActivity.class));
                finish();
            }
        });


    }
}