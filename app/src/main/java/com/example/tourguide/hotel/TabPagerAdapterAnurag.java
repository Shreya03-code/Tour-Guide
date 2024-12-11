package com.example.tourguide.hotel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterAnurag extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterAnurag(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragAnuragWeather fragAnuragWeather = new FragAnuragWeather();
                return fragAnuragWeather;

            case 1:
                FragAnuragInfo fragAnuragInfo = new  FragAnuragInfo();
                return fragAnuragInfo;

            case 2:
                FragAnuragMap fragAnuragMap = new  FragAnuragMap();
                return fragAnuragMap;
            case 3:
                FragAnuragGal fragAnuragGal = new  FragAnuragGal();
                return fragAnuragGal;
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
