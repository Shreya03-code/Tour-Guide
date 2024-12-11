package com.example.tourguide.atm;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterAxis extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterAxis(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragAxisWeather fragAxisWeather = new FragAxisWeather();
                return fragAxisWeather;

            case 1:
                FragAxisInfo fragAxisInfo = new  FragAxisInfo();
                return fragAxisInfo;

            case 2:
                FragAxisMap fragAxisMap = new  FragAxisMap();
                return fragAxisMap;
            case 3:
                FragAxisGal fragAxisGal = new  FragAxisGal();
                return fragAxisGal;
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
