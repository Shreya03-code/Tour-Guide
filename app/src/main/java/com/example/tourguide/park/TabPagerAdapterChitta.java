package com.example.tourguide.park;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterChitta extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterChitta(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragChittaWeather fragChittaWeather = new FragChittaWeather();
                return fragChittaWeather;

            case 1:
                FragChittaInfo fragChittaInfo = new  FragChittaInfo();
                return fragChittaInfo;

            case 2:
                FragChittaMap fragChittaMap = new  FragChittaMap();
                return fragChittaMap;
            case 3:
                FragChittaGal fragChittaGal = new  FragChittaGal();
                return fragChittaGal;
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
