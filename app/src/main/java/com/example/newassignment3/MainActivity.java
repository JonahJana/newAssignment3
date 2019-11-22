package com.example.newassignment3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  Edit_Meetings.OnFragmentInteractionListener, View_Meetings.OnFragmentInteractionListener{

    ViewPager vPager;

    FragMangAdapter fmAdapt;

    Button NewMeets, ViewMeets;
    TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmAdapt = new FragMangAdapter(getSupportFragmentManager());
        // Add Fragments to adapter one by one
//        fmAdapt.addFragment(new Edit_Meetings());
//        fmAdapt.addFragment(new View_Meetings());

        vPager = (ViewPager) findViewById(R.id.pager);
        vPager.setAdapter(fmAdapt);

        tablayout = findViewById(R.id.tabLayout);
        tablayout.setupWithViewPager(vPager);

//        NewMeets = findViewById(R.id.NEW_Page);
//
//        NewMeets.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                vPager.setCurrentItem(0, true);
//                System.out.println("new meeting page clicked");
//                //fmAdapt.getItem(0)
//            }
//        });
//
//        ViewMeets = findViewById(R.id.VIEW_Page);
//
//        ViewMeets.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println(vPager.getCurrentItem());
//                vPager.setCurrentItem(1, true);
//                System.out.println("view meeting page clicked");
//                System.out.println(vPager.getCurrentItem());
//
//
//            }
//        });

    }

    @Override
    public void onEditFragmentInteraction(String s)
    {
        System.out.println("on edit");
    }
    @Override
    public void onViewFragmentInteraction(String s)
    {
        System.out.println("on view");
    }



}
