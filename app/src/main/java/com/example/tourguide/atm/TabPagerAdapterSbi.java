package com.example.tourguide.atm;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterSbi extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterSbi(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragSbiWeather fragSbiWeather = new FragSbiWeather();
                return fragSbiWeather;

            case 1:
                FragSbiInfo fragSbiInfo = new  FragSbiInfo();
                return fragSbiInfo;

            case 2:
                FragSbiMap fragSbiMap = new  FragSbiMap();
                return fragSbiMap;
            case 3:
                FragSbiGal fragSbiGal = new  FragSbiGal();
                return fragSbiGal;
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
