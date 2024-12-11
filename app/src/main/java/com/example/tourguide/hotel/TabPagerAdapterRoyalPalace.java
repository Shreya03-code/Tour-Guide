package com.example.tourguide.hotel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterRoyalPalace extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterRoyalPalace(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragRoyalWeather fragRoyalWeather = new FragRoyalWeather();
                return fragRoyalWeather;

            case 1:
                FragRoyalInfo fragRoyalInfo = new  FragRoyalInfo();
                return fragRoyalInfo;

            case 2:
                FragRoyalMap fragRoyalMap = new  FragRoyalMap();
                return fragRoyalMap;
            case 3:
                FragRoyalGal fragRoyalGal = new  FragRoyalGal();
                return fragRoyalGal;
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
