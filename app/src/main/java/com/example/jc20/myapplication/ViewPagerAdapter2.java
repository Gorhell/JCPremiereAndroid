package com.example.jc20.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by JC2.0 on 2/13/2015.
 */
public class ViewPagerAdapter2 extends FragmentPagerAdapter{

    List<Fragment> pfragments;

    public ViewPagerAdapter2(FragmentManager fm) {

        super(fm);

        pfragments = new ArrayList<Fragment>();
    }

    @Override
    public Fragment getItem(int position) {

        return pfragments.get(position);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return pfragments.size();
    }

    public void addFragments2 (Fragment fragmentp){

        this.pfragments.add(fragmentp);
    }




}
