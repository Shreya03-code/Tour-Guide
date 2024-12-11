package com.example.tourguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.tourguide.atm.AtmActivity;
import com.example.tourguide.food.FoodActivity;
import com.example.tourguide.hospital.HospitalActivity;
import com.example.tourguide.hotel.HotelActivity;
import com.example.tourguide.park.FunActivity;
import com.example.tourguide.station.StationActivity;
import com.google.android.material.navigation.NavigationView;

public class AttractionActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView  navigationView;
    Toolbar toolbar;

    Button hospital,hotel,atm,station,food,fun,location;

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(drawerToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_attraction);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
//            @SuppressLint("NonConstantResourceId")
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id = item.getItemId();
//                if(id== R.id.home){
//                    Toast.makeText(AttractionActivity.this,"Home Selected", Toast.LENGTH_SHORT).show();
//                } else if (id == R.id.contact) {
//                    Toast.makeText(AttractionActivity.this,"Contact Selected", Toast.LENGTH_SHORT).show();
//                }
//                else if (id == R.id.gallery) {
//                    Toast.makeText(AttractionActivity.this,"Gallery Selected", Toast.LENGTH_SHORT).show();
//                }
//                else if (id == R.id.logout) {
//                    Toast.makeText(AttractionActivity.this,"Log Out Selected", Toast.LENGTH_SHORT).show();
//                }
//                else if (id == R.id.login) {
//                    Toast.makeText(AttractionActivity.this,"Log in Selected", Toast.LENGTH_SHORT).show();
//                }
//                else if (id == R.id.rate_us) {
//                    Toast.makeText(AttractionActivity.this,"Rate us Selected", Toast.LENGTH_SHORT).show();
//                }
//                return false;
//            }
//        });

        hospital = findViewById(R.id.butt_hospital);
        hotel = findViewById(R.id.butt_hotel);
        atm = findViewById(R.id.butt_atm);
        station = findViewById(R.id.butt_station);
        food = findViewById(R.id.butt_food);
        fun = findViewById(R.id.butt_fun);
        location = findViewById(R.id.my_loc);

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttractionActivity.this, HospitalActivity.class));
                finish();
            }
        });

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttractionActivity.this, HotelActivity.class));
                finish();
            }
        });

        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttractionActivity.this, AtmActivity.class));
                finish();

            }
        });

        station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttractionActivity.this, StationActivity.class));
                finish();

            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttractionActivity.this, FoodActivity.class));
                finish();

            }
        });

        fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttractionActivity.this, FunActivity.class));
                finish();

            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttractionActivity.this,MapActivity.class));
                finish();

            }
        });
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
           int id = menuItem.getItemId();
                if(id== R.id.home){
                    Toast.makeText(AttractionActivity.this,"Home Selected", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.contact) {
                    Intent i = new Intent(AttractionActivity.this,ContactActivity.class);
                    startActivity(i);
                }
                else if (id == R.id.gallery) {
                    Intent i = new Intent(AttractionActivity.this,GalleryActivity.class);
                    startActivity(i);
                }
                else if (id == R.id.logout) {
                    Toast.makeText(AttractionActivity.this,"Log Out Selected", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.login) {
                    Toast.makeText(AttractionActivity.this,"Log in Selected", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.rate_us) {
                    Toast.makeText(AttractionActivity.this,"Rate us Selected", Toast.LENGTH_SHORT).show();
                }
       return true;
    }
}