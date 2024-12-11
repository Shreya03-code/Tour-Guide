package com.example.tourguide.hospital;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tourguide.hospital.FragAiimsInfo;
import com.example.tourguide.hospital.FragJnmInfo;
import com.example.tourguide.hospital.FragJnmMap;
import com.example.tourguide.hospital.FragJnmWeather;
import com.example.tourguide.hospital.FragSnrGal;
import com.example.tourguide.hospital.FragSnrInfo;
import com.example.tourguide.hospital.FragSnrMap;
import com.example.tourguide.hospital.FragSnrWeather;

import java.util.List;

public class TabPagerAdapterAiims extends FragmentStatePagerAdapter {

    int tabCount;
//    List<Integer> list;

    public TabPagerAdapterAiims(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }




    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragAiimsWeather fragAiimsWeather = new FragAiimsWeather();
                return fragAiimsWeather;
            case 1:
                FragAiimsInfo fragAiimsInfo = new FragAiimsInfo();
                return fragAiimsInfo;
            case 2:
                FragAiimsMap fragAiimsMap = new FragAiimsMap();
                return fragAiimsMap;
            case 3:
                FragAiimsGal fragAiimsGal = new FragAiimsGal();
                return fragAiimsGal;
            default:
                return null;

        }
    }

    @Override
    public int getCount()
    {
        return tabCount;
    }




}
