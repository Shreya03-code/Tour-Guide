package com.example.tourguide.food;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterRollacosta extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterRollacosta(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragRollacostaWeather fragRollacostaWeather = new FragRollacostaWeather();
                return fragRollacostaWeather;

            case 1:
                FragRollacostaInfo fragRollacostaInfo = new  FragRollacostaInfo();
                return fragRollacostaInfo;

            case 2:
                FragRollacostaMap fragRollacostaMap = new  FragRollacostaMap();
                return fragRollacostaMap;
            case 3:
                FragRollacostaGal fragRollacostaGal = new  FragRollacostaGal();
                return fragRollacostaGal;
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
