package com.example.tourguide.hotel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterDiamond extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterDiamond(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragDiamondWeather fragDiamondWeather = new FragDiamondWeather();
                return fragDiamondWeather;

            case 1:
                FragDiamondInfo fragDiamondInfo = new  FragDiamondInfo();
                return fragDiamondInfo;

            case 2:
                FragDiamondMap fragDiamondMap = new  FragDiamondMap();
                return fragDiamondMap;
            case 3:
                FragDiamondGal fragDiamondGal = new  FragDiamondGal();
                return fragDiamondGal;
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
