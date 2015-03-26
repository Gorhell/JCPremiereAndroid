package com.example.jc20.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import com.squareup.picasso.Picasso;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;

/**
 * Created by JC2.0 on 2/12/2015.
 */
public class CFragments extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String BACKGROUND_COLOR = "color";
    private static final String IMAGEVIEW ="image";

    private int section_number;
    private int color;
    private int image;

    public static CFragments newInstance(int sectionNumber, int color, int image) {
        CFragments fragment = new CFragments();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        args.putInt(BACKGROUND_COLOR, color);
        args.putInt(IMAGEVIEW, image);
        fragment.setArguments(args);
        fragment.setRetainInstance(true);
        return fragment;
    }

    public CFragments() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null){
            this.section_number = getArguments().getInt(ARG_SECTION_NUMBER);
            this.color = getArguments().getInt(BACKGROUND_COLOR);
            this.image = getArguments().getInt(IMAGEVIEW);
        }
        else{
            this.color = Color.GRAY;
            this.section_number = (int)(Math.random() * 5);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_plan, container, false);


        rootView.setBackgroundColor(this.color);

        ImageViewTouch frg_image = (ImageViewTouch) rootView.findViewById(R.id.frg_imageView);
        //frg_image.setImageResource(image);
        Picasso.with(getActivity()).load(image).into(frg_image);
        return rootView;
    }
}