package com.example.tourguide.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.tourguide.R;
import com.google.android.material.tabs.TabLayout;

public class DetailsRoyalhutActivity extends AppCompatActivity  implements TabLayout.OnTabSelectedListener{

    TabLayout tabLayout;
    ViewPager viewPager;
    TabPagerAdapterRoyalhut tabPagerAdapterRoyalhut;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details_royalhut);

        init();

        button2 = findViewById(R.id.back_royalhut);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailsRoyalhutActivity.this, RowFoodActivity.class));
                finish();

            }
        });

    }


    public void init(){
        tabLayout = findViewById(R.id.tab);
        tabLayout.addTab(tabLayout.newTab().setText("Weather"));
        tabLayout.addTab(tabLayout.newTab().setText("Info"));
        tabLayout.addTab(tabLayout.newTab().setText("MapView"));
        tabLayout.addTab(tabLayout.newTab().setText("Gallery"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager= findViewById(R.id.pager);
        tabPagerAdapterRoyalhut = new TabPagerAdapterRoyalhut(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(tabPagerAdapterRoyalhut);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(this);


    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}