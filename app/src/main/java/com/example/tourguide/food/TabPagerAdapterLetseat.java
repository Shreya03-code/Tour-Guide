package com.example.tourguide.food;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterLetseat extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterLetseat(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragLetseatWeather fragLetseatWeather = new FragLetseatWeather();
                return fragLetseatWeather;

            case 1:
                FragLetseatInfo fragLetseatInfo = new  FragLetseatInfo();
                return fragLetseatInfo;

            case 2:
                FragLetseatMap fragLetseatMap = new  FragLetseatMap();
                return fragLetseatMap;
            case 3:
                FragLetseatGal fragLetseatGal = new  FragLetseatGal();
                return fragLetseatGal;
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
