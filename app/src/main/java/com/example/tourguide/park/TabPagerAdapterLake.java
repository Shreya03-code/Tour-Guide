package com.example.tourguide.park;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterLake extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterLake(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragLakeWeather fragLakeWeather = new FragLakeWeather();
                return fragLakeWeather;

            case 1:
                FragLakeInfo fragLakeInfo = new  FragLakeInfo();
                return fragLakeInfo;

            case 2:
                FragLakeMap fragLakeMap = new  FragLakeMap();
                return fragLakeMap;
            case 3:
                FragLakeGal fragLakeGal = new  FragLakeGal();
                return fragLakeGal;
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
