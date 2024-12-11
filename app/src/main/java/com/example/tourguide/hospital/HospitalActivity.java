package com.example.tourguide.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguide.AttractionActivity;
import com.example.tourguide.R;

public class HospitalActivity extends AppCompatActivity {

    ListView list;
    Button hospitalback;
    String hospitals[] = {
            "SNR Carnival Hospital",
            "JNM",
            "AIIMS",
            "ESI",
            "Gandhi Memorial Hospital",
    };

    Integer[] imageId = {
            R.drawable.hospital1,
            R.drawable.hospital2,
            R.drawable.hospital3,
            R.drawable.hospital4,
            R.drawable.hospital5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hospital);

        CustomHospitalList adapter = new CustomHospitalList(HospitalActivity.this,hospitals,imageId);

        list = findViewById(R.id.hospital_list);
        list.setAdapter(adapter);

        hospitalback = findViewById(R.id.back_hospital);
        hospitalback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HospitalActivity.this, AttractionActivity.class));
                finish();
            }
        });
    }
}