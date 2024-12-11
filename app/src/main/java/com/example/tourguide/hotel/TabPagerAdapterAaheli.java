package com.example.tourguide.hotel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterAaheli extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterAaheli(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragAaheliWeather fragAaheliWeather = new FragAaheliWeather();
                return fragAaheliWeather;

            case 1:
                FragAaheliInfo fragAaheliInfo = new  FragAaheliInfo();
                return fragAaheliInfo;

            case 2:
                FragAaheliMap fragAaheliMap = new  FragAaheliMap();
                return fragAaheliMap;
            case 3:
                FragAaheliGal fragAaheliGal = new  FragAaheliGal();
                return fragAaheliGal;
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
