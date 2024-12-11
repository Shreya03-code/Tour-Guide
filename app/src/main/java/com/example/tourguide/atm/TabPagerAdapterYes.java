package com.example.tourguide.atm;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterYes extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterYes(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragYesWeather fragYesWeather = new FragYesWeather();
                return fragYesWeather;

            case 1:
                FragYesInfo fragYesInfo = new  FragYesInfo();
                return fragYesInfo;

            case 2:
                FragYesMap fragYesMap = new  FragYesMap();
                return fragYesMap;
            case 3:
                FragYesGal fragYesGal = new  FragYesGal();
                return fragYesGal;
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
