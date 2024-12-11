package com.example.tourguide.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

//import com.example.tourguide.MyAdapter;
import com.example.tourguide.R;
import com.google.android.material.tabs.TabLayout;

public class DetailHospitalActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

//    public String title;

    TabLayout tabLayout;
    ViewPager viewPager;
//    ViewPager viewPager2;
    TabPagerAdapter tabPagerAdapterSnr;
//    TabPagerAdapterJnm tabPagerAdapterJnm;
//    TabPagerAdapterAiims tabPagerAdapterAiims;
//    TabPagerAdapterEsi tabPagerAdapterEsi;
//    TabPagerAdapterGandhi tabPagerAdapterGandhi;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_hospital);

//        Bundle bundle = getIntent().getExtras();
//        title = bundle.getString("khos");
//        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();


        init();

        button = findViewById(R.id.back_hospital);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailHospitalActivity.this, RowHospitalActivity.class));
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
//        viewPager2= findViewById(R.id.pager);
        tabPagerAdapterSnr = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
//        tabPagerAdapterJnm = new TabPagerAdapterJnm(getSupportFragmentManager(),tabLayout.getTabCount());
//        tabPagerAdapterAiims = new TabPagerAdapterAiims(getSupportFragmentManager(), tabLayout.getTabCount());
//        tabPagerAdapterEsi = new TabPagerAdapterEsi(getSupportFragmentManager(),tabLayout.getTabCount());
//        tabPagerAdapterGandhi = new TabPagerAdapterGandhi(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(tabPagerAdapterSnr);

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