package com.example.tourguide.hospital;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.tourguide.R;

public class FragSnrGal extends Fragment {

    ViewPager viewPager;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.snr_gal_frag, container, false);
        return view;
    }
}
