package com.example.tourguide.hotel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterGeetanjali extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterGeetanjali(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragGeetanjaliWeather fragGeetanjaliWeather = new FragGeetanjaliWeather();
                return fragGeetanjaliWeather;

            case 1:
                FragGeetanjaliInfo fragGeetanjaliInfo = new  FragGeetanjaliInfo();
                return fragGeetanjaliInfo;

            case 2:
                FragGeetanjaliMap fragGeetanjaliMap = new  FragGeetanjaliMap();
                return fragGeetanjaliMap;
            case 3:
                FragGeetanjaliGal fragGeetanjaliGal = new  FragGeetanjaliGal();
                return fragGeetanjaliGal;
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
