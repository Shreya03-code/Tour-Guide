package com.example.tourguide.station;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterKanchrapara extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterKanchrapara(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragKanchraparaWeather fragKanchraparaWeather = new FragKanchraparaWeather();
                return fragKanchraparaWeather;

            case 1:
                FragKanchraparaInfo fragKanchraparaInfo = new  FragKanchraparaInfo();
                return fragKanchraparaInfo;

            case 2:
                FragKanchraparaMap fragKanchraparaMap = new  FragKanchraparaMap();
                return fragKanchraparaMap;
            case 3:
                FragKanchraparaGal fragKanchraparaGal = new  FragKanchraparaGal();
                return fragKanchraparaGal;
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
