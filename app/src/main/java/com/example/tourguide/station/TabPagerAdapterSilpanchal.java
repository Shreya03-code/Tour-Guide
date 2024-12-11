package com.example.tourguide.station;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterSilpanchal extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterSilpanchal(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragSilpanchalWeather fragSilpanchalWeather = new FragSilpanchalWeather();
                return fragSilpanchalWeather;

            case 1:
                FragSilpanchalInfo fragSilpanchalInfo = new  FragSilpanchalInfo();
                return fragSilpanchalInfo;

            case 2:
                FragSilpanchalMap fragSilpanchalMap = new  FragSilpanchalMap();
                return fragSilpanchalMap;
            case 3:
                FragSilpanchalGal fragSilpanchalGal = new  FragSilpanchalGal();
                return fragSilpanchalGal;
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
