package com.example.tourguide.station;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterKalyanimain extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterKalyanimain(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragKalyaniWeather fragKalyaniWeather = new FragKalyaniWeather();
                return fragKalyaniWeather;

            case 1:
                FragKalyaniInfo fragKalyaniInfo = new  FragKalyaniInfo();
                return fragKalyaniInfo;

            case 2:
                FragKalyaniMap fragKalyaniMap = new  FragKalyaniMap();
                return fragKalyaniMap;
            case 3:
                FragKalyaniGal fragKalyaniGal = new  FragKalyaniGal();
                return fragKalyaniGal;
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
