package com.example.tourguide.food;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterShubham extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterShubham(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragShubhamWeather fragShubhamWeather = new FragShubhamWeather();
                return fragShubhamWeather;

            case 1:
                FragShubhamInfo fragShubhamInfo = new  FragShubhamInfo();
                return fragShubhamInfo;

            case 2:
                FragShubhamMap fragShubhamMap = new  FragShubhamMap();
                return fragShubhamMap;
            case 3:
                FragShubhamGal fragShubhamGal = new  FragShubhamGal();
                return fragShubhamGal;
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
