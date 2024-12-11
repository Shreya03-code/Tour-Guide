package com.example.tourguide.station;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterSimanta extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterSimanta(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragSimantaWeather fragSimantaWeather = new FragSimantaWeather();
                return fragSimantaWeather;

            case 1:
                FragSimantaInfo fragSimantaInfo = new  FragSimantaInfo();
                return fragSimantaInfo;

            case 2:
                FragSimantaMap fragSimantaMap = new  FragSimantaMap();
                return fragSimantaMap;
            case 3:
                FragSimantaGal fragSimantaGal = new  FragSimantaGal();
                return fragSimantaGal;
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
