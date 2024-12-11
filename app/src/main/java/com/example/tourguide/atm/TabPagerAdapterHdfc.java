package com.example.tourguide.atm;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterHdfc extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterHdfc(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragHdfcWeather fragHdfcWeather = new FragHdfcWeather();
                return fragHdfcWeather;

            case 1:
                FragHdfcInfo fragHdfcInfo = new  FragHdfcInfo();
                return fragHdfcInfo;

            case 2:
                FragHdfcMap fragHdfcMap = new  FragHdfcMap();
                return fragHdfcMap;
            case 3:
                FragHdfcGal fragHdfcGal = new  FragHdfcGal();
                return fragHdfcGal;
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
