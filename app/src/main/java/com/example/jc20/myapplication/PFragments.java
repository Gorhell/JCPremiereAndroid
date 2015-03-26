package com.example.jc20.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;
/**
 * Created by JC2.0 on 2/13/2015.
 */
public class PFragments extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String BACKGROUND_COLOR1 = "colors1";
    private static final String IMAGE_VIEW = "images1";

    private int section_number;
    private int colors1;
    private int images1;

    public static PFragments newInstance(int sectionNumber, int colors1, int images1) {
        PFragments fragment = new PFragments();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        args.putInt(BACKGROUND_COLOR1, colors1);
        args.putInt(IMAGE_VIEW, images1);
        fragment.setArguments(args);
        return fragment;
    }

    public PFragments() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null){
            this.section_number = getArguments().getInt(ARG_SECTION_NUMBER);
            this.colors1 = getArguments().getInt(BACKGROUND_COLOR1);
            this.images1 = getArguments().getInt(IMAGE_VIEW);
        }
        else{
            this.colors1 = Color.GRAY;
            this.section_number = (int) (Math.random() * 5);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_products, container, false);

        rootView.setBackgroundColor(this.colors1);

        ImageViewTouch frg_image2 = (ImageViewTouch) rootView.findViewById(R.id.frg_imageView2);
        //frg_image2.setImageResource(images1);
        Picasso.with(getActivity()).load(images1).into(frg_image2);
        return rootView;
    }
}
