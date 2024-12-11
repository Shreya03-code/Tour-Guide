package com.example.tourguide.food;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterDhakeswaripalace extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterDhakeswaripalace(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragDhakeswaripalaceWeather fragDhakeswaripalaceWeather = new FragDhakeswaripalaceWeather();
                return fragDhakeswaripalaceWeather;

            case 1:
                FragDhakeswaripalaceInfo fragDhakeswaripalaceInfo = new  FragDhakeswaripalaceInfo();
                return fragDhakeswaripalaceInfo;

            case 2:
                FragDhakeswaripalaceMap fragDhakeswaripalaceMap = new  FragDhakeswaripalaceMap();
                return fragDhakeswaripalaceMap;
            case 3:
                FragDhakeswaripalaceGal fragDhakeswaripalaceGal = new  FragDhakeswaripalaceGal();
                return fragDhakeswaripalaceGal;
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
