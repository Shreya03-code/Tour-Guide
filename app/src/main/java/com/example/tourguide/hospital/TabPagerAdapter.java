package com.example.tourguide.hospital;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;


    public TabPagerAdapter(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                FragSnrWeather fragSnrWeather = new FragSnrWeather();
                return fragSnrWeather;

            case 1:
                FragSnrInfo fragSnrInfo = new FragSnrInfo();
                return fragSnrInfo;

            case 2:
                FragSnrMap fragSnrMap = new FragSnrMap();
                return fragSnrMap;
            case 3:
                FragSnrGal fragSnrGal = new FragSnrGal();
                return fragSnrGal;
//            case 4:
//                FragJnmWeather fragJnmWeather = new FragJnmWeather();
//                return fragJnmWeather;
//            case 5:
//                FragJnmInfo fragJnmInfo = new FragJnmInfo();
//                return fragJnmInfo;
//            case 6:
//                FragJnmMap fragJnmMap = new FragJnmMap();
//                return fragJnmMap;
//            case 7:
//                FragAiimsInfo fragAiimsInfo = new FragAiimsInfo();
//                return fragAiimsInfo;
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
