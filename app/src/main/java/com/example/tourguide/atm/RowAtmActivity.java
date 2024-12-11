package com.example.tourguide.atm;

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

public class RowAtmActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_row_atm);

        b1 = findViewById(R.id.back_atm);
        b2 = findViewById(R.id.but_axis);
        b3 = findViewById(R.id.but_sbi);
        b4 = findViewById(R.id.but_hdfc);
        b5 = findViewById(R.id.but_pnb);
        b6 = findViewById(R.id.but_yes);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowAtmActivity.this, AtmActivity.class));
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowAtmActivity.this, DetailsAxisActivity.class));
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowAtmActivity.this, DetailsSbiActivity.class));
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowAtmActivity.this, DetailsHdfcActivity.class));
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowAtmActivity.this, DetailsPnbActivity.class));
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowAtmActivity.this, DetailsYesActivity.class));
                finish();
            }
        });


    }
}