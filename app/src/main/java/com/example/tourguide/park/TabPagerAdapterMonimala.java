package com.example.tourguide.park;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterMonimala extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterMonimala(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragMonimalaWeather fragMonimalaWeather = new FragMonimalaWeather();
                return fragMonimalaWeather;

            case 1:
                FragMonimalaInfo fragMonimalaInfo = new  FragMonimalaInfo();
                return fragMonimalaInfo;

            case 2:
                FragMonimalaMap fragMonimalaMap = new  FragMonimalaMap();
                return fragMonimalaMap;
            case 3:
                FragMonimalaGal fragMonimalaGal = new  FragMonimalaGal();
                return fragMonimalaGal;
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
