package com.example.tourguide.park;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterCp extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterCp(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragCpWeather fragCpWeather = new FragCpWeather();
                return fragCpWeather;

            case 1:
                FragCpInfo fragCpInfo = new  FragCpInfo();
                return fragCpInfo;

            case 2:
                FragCpMap fragCpMap = new  FragCpMap();
                return fragCpMap;
            case 3:
                FragCpGal fragCpGal = new  FragCpGal();
                return fragCpGal;
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
