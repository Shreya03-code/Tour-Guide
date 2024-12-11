package com.example.tourguide.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguide.AttractionActivity;
import com.example.tourguide.R;

public class FoodActivity extends AppCompatActivity {
    ListView list;
    Button foodback;
    String foods[] = {
            "Dhakeswari Palace",
            "Let's Eat",
            "Rolla Costa",
            "Royal Hut",
            "Shubham",

    };

    Integer[] imageId = {
            R.drawable.food1,
            R.drawable.food2,
            R.drawable.food3,
            R.drawable.food4,
            R.drawable.food5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_food);

        CustomFoodList adapter = new CustomFoodList(FoodActivity.this,foods,imageId);

        list = findViewById(R.id.food_list);
        list.setAdapter(adapter);

        foodback = findViewById(R.id.back_food);

        foodback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodActivity.this, AttractionActivity.class));
                finish();
            }
        });

    }
}