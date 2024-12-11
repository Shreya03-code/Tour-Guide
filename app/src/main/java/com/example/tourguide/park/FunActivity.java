package com.example.tourguide.park;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguide.AttractionActivity;
import com.example.tourguide.R;

public class FunActivity extends AppCompatActivity {

    ListView list;
    Button funback;
    String funs[] = {
            "Central Park",
            "Chittaranjan Park",
            "Picnic Gurden",
            "Lake Park",
            "Monimala Park",
    };

    Integer[] imageId = {
            R.drawable.fun1,
            R.drawable.fun2,
            R.drawable.fun3,
            R.drawable.fun4,
            R.drawable.fun5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fun);

        CustomFunList adapter = new CustomFunList(FunActivity.this,funs,imageId);

        list = findViewById(R.id.fun_list);
        list.setAdapter(adapter);

        funback = findViewById(R.id.back_fun);
        funback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FunActivity.this, AttractionActivity.class));
                finish();
            }
        });
    }
}