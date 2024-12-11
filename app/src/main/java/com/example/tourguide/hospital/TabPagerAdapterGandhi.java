package com.example.tourguide.hospital;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tourguide.hospital.FragAiimsInfo;
import com.example.tourguide.hospital.FragJnmInfo;
import com.example.tourguide.hospital.FragJnmMap;
import com.example.tourguide.hospital.FragJnmWeather;
import com.example.tourguide.hospital.FragSnrGal;
import com.example.tourguide.hospital.FragSnrInfo;
import com.example.tourguide.hospital.FragSnrMap;
import com.example.tourguide.hospital.FragSnrWeather;

import java.util.List;

public class TabPagerAdapterGandhi extends FragmentStatePagerAdapter {

    int tabCount;
//    List<Integer> list;

    public TabPagerAdapterGandhi(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

//    public TabPagerAdapter(List<Integer> imageList) {
//        super((FragmentManager) imageList);
//        this.list = imageList;
//    }


    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragGandhiWeather fragGandhiWeather = new FragGandhiWeather();
                return fragGandhiWeather;
            case 1:
                FragGandhiInfo fragGandhiInfo = new FragGandhiInfo();
                return fragGandhiInfo;
            case 2:
                FragGandhiMap fragGandhiMap = new FragGandhiMap();
                return fragGandhiMap;
            case 3:
                FragGandhiGal fragGandhiGal = new FragGandhiGal();
                return fragGandhiGal;
            default:
                return null;

        }
    }

    @Override
    public int getCount()
    {
        return tabCount;
    }

//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view == object;
//    }

//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.image_layout,container,false);
//        ImageView image = view.findViewById(R.id.imageView);
//        image.setImageResource(list.get(position));
//        container.addView(view);
//        return view;
//    }

//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        container.removeView((View) object);
//    }



}
