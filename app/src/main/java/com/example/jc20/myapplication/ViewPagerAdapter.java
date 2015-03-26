package com.example.jc20.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by JC2.0 on 2/12/2015.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments;


    public ViewPagerAdapter (FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<Fragment>();
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }

    public void addFragment(Fragment xfragment){

        this.fragments.add(xfragment);
    }

}
