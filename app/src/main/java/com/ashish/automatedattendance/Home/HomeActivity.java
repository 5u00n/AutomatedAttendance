package com.ashish.automatedattendance.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ashish.automatedattendance.R;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        viewPager = findViewById(R.id.home_attandance_report_viewpager);
        tabLayout = findViewById(R.id.home_attandance_report_tabnav);

        tabLayout.addTab(tabLayout.newTab().setText("Weekly"));
        tabLayout.addTab(tabLayout.newTab().setText("Monthly"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        ///viewPager.setAdapter(new WeeklyReportAdapter(getBaseContext(),tabLayout.getTabCount(),getBaseContext()));

        viewPager.getCurrentItem();


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }
}