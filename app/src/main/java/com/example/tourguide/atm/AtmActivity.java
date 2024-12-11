package com.example.tourguide.atm;

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

public class AtmActivity extends AppCompatActivity {

    ListView list;
    Button atmback;
    String atms[] = {
            "ATM 1",
            "ATM 2",
            "ATM 3",
            "ATM 4",
            "ATM 5",
    };

    Integer[] imageId = {
            R.drawable.atm1,
            R.drawable.atm2,
            R.drawable.atm3,
            R.drawable.atm4,
            R.drawable.atm5,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_atm);

        CustomAtmList adapter = new CustomAtmList(AtmActivity.this,atms,imageId);

        list = findViewById(R.id.atm_list);
        list.setAdapter(adapter);

        atmback = findViewById(R.id.back_atm);

        atmback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AtmActivity.this, AttractionActivity.class));
                finish();
            }
        });


    }
}