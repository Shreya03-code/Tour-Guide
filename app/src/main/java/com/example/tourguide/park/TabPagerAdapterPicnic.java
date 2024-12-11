package com.example.tourguide.park;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterPicnic extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterPicnic(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragPicnicWeather fragPicnicWeather = new FragPicnicWeather();
                return fragPicnicWeather;

            case 1:
                FragPicnicInfo fragPicnicInfo = new  FragPicnicInfo();
                return fragPicnicInfo;

            case 2:
                FragPicnicMap fragPicnicMap = new  FragPicnicMap();
                return fragPicnicMap;
            case 3:
                FragPicnicGal fragPicnicGal = new  FragPicnicGal();
                return fragPicnicGal;
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
