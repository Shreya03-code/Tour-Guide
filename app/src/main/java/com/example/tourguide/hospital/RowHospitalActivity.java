package com.example.tourguide.hospital;

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

public class RowHospitalActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_row_hospital);

        b1 = findViewById(R.id.back_hospital);
        b2 = findViewById(R.id.but_snr);
        b3 = findViewById(R.id.but_jnm);
        b4 = findViewById(R.id.but_aiims);
        b5 = findViewById(R.id.but_esi);
        b6 = findViewById(R.id.but_gandhi);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHospitalActivity.this, HospitalActivity.class));
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHospitalActivity.this, DetailHospitalActivity.class));
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHospitalActivity.this, DetailJnmActivity.class));
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHospitalActivity.this, DetailAiimsActivity.class));
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHospitalActivity.this, DetailsEsiActivity.class));
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RowHospitalActivity.this, DetailsGandhiActivity.class));
                finish();
            }
        });


    }
}