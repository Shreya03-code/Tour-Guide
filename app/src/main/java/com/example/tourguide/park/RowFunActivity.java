package com.example.tourguide.park;

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

public class RowFunActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_row_fun);

        b1 = findViewById(R.id.back_park);
        b2 = findViewById(R.id.but_cp);
        b3 = findViewById(R.id.but_chitta);
        b4 = findViewById(R.id.but_lake);
        b5 = findViewById(R.id.but_picnic);
        b6 = findViewById(R.id.but_moni);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFunActivity.this, FunActivity.class));
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFunActivity.this, DetailsCpActivity.class));
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFunActivity.this, DetailsChittaActivity.class));
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFunActivity.this, DetailsLakeActivity.class));
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFunActivity.this, DetailsPicnicActivity.class));
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowFunActivity.this, DetailsMonimalaActivity.class));
                finish();
            }
        });


    }
}