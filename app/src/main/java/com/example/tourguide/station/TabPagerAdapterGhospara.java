package com.example.tourguide.station;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterGhospara extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterGhospara(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragGhosparaWeather fragGhosparaWeather = new FragGhosparaWeather();
                return fragGhosparaWeather;

            case 1:
                FragGhosparaInfo fragGhosparaInfo = new  FragGhosparaInfo();
                return fragGhosparaInfo;

            case 2:
                FragGhosparaMap fragGhosparaMap = new  FragGhosparaMap();
                return fragGhosparaMap;
            case 3:
                FragGhosparaGal fragGhosparaGal = new  FragGhosparaGal();
                return fragGhosparaGal;
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
