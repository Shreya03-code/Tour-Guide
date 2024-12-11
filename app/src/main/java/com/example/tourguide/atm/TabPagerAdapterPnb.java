package com.example.tourguide.atm;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterPnb extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterPnb(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragPnbWeather fragPnbWeather = new FragPnbWeather();
                return fragPnbWeather;

            case 1:
                FragPnbInfo fragPnbInfo = new  FragPnbInfo();
                return fragPnbInfo;

            case 2:
                FragPnbMap fragPnbMap = new  FragPnbMap();
                return fragPnbMap;
            case 3:
                FragPnbGal fragPnbGal = new  FragPnbGal();
                return fragPnbGal;
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
