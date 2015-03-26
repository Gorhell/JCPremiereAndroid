package com.example.jc20.myapplication;

import java.util.Locale;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.FloatMath;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;


public class plan extends ActionBarActivity{


    ViewPagerAdapter mSectionsPagerAdapter;

    ViewPager mViewPager;

    public static Integer[] mImageIds = {
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);




        mSectionsPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        mViewPager = (ViewPager) findViewById(R.id.pager);

        mSectionsPagerAdapter.addFragment(CFragments.newInstance(0, getResources().getColor(R.color.black), R.drawable.p1));
        mSectionsPagerAdapter.addFragment(CFragments.newInstance(1, getResources().getColor(R.color.black), mImageIds[1]));
        mSectionsPagerAdapter.addFragment(CFragments.newInstance(2, getResources().getColor(R.color.black), mImageIds[2]));
        mSectionsPagerAdapter.addFragment(CFragments.newInstance(3, getResources().getColor(R.color.black), mImageIds[3]));
        mSectionsPagerAdapter.addFragment(CFragments.newInstance(4, getResources().getColor(R.color.black), mImageIds[4]));

        mViewPager.setAdapter(mSectionsPagerAdapter);

    }




}

