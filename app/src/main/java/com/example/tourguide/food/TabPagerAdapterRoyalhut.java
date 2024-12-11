package com.example.tourguide.food;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapterRoyalhut extends FragmentStatePagerAdapter {

    int tabCount;
    public TabPagerAdapterRoyalhut(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragRoyalhutWeather fragRoyalhutWeather = new FragRoyalhutWeather();
                return fragRoyalhutWeather;

            case 1:
                FragRoyalhutInfo fragRoyalhutInfo = new  FragRoyalhutInfo();
                return fragRoyalhutInfo;

            case 2:
                FragRoyalhutMap fragRoyalhutMap = new  FragRoyalhutMap();
                return fragRoyalhutMap;
            case 3:
                FragRoyalhutGal fragRoyalhutGal = new  FragRoyalhutGal();
                return fragRoyalhutGal;
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
