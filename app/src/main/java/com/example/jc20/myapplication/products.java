package com.example.jc20.myapplication;

import java.util.Locale;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class products extends ActionBarActivity {


    ViewPagerAdapter2 mSectionsPagerAdapter;

    ViewPager mViewPager;

    public static Integer[] pImageIds = {
            R.drawable.mainmenu,
            R.drawable.kape,
            R.drawable.premieregt,
            R.drawable.hilife2,
            R.drawable.calvit,
            R.drawable.barley,
            R.drawable.barley2,
            R.drawable.spirulina2,
            R.drawable.fourgreen,
            R.drawable.glutafit2,
            R.drawable.pinkishcream,
            R.drawable.toner,
            R.drawable.bbcream,
            R.drawable.daycream,
            R.drawable.lotion,
            R.drawable.omnisoap,
            R.drawable.shuya2,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);


        mSectionsPagerAdapter = new ViewPagerAdapter2(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);

        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(0, getResources().getColor(R.color.black), R.drawable.mainmenu));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(1, getResources().getColor(R.color.black), pImageIds[1]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(2, getResources().getColor(R.color.black), pImageIds[2]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(3, getResources().getColor(R.color.black), pImageIds[3]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(4, getResources().getColor(R.color.black), pImageIds[4]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(5, getResources().getColor(R.color.black), pImageIds[5]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(6, getResources().getColor(R.color.black), pImageIds[6]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(7, getResources().getColor(R.color.black), pImageIds[7]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(8, getResources().getColor(R.color.black), pImageIds[8]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(9, getResources().getColor(R.color.black), pImageIds[9]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(10, getResources().getColor(R.color.black), pImageIds[10]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(11, getResources().getColor(R.color.black), pImageIds[11]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(12, getResources().getColor(R.color.black), pImageIds[12]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(13, getResources().getColor(R.color.black), pImageIds[13]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(14, getResources().getColor(R.color.black), pImageIds[14]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(15, getResources().getColor(R.color.black), pImageIds[15]));
        mSectionsPagerAdapter.addFragments2(PFragments.newInstance(16, getResources().getColor(R.color.black), pImageIds[16]));




        mViewPager.setAdapter(mSectionsPagerAdapter);

    }

}
