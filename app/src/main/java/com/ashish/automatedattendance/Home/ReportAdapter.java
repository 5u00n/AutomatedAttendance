package com.ashish.automatedattendance.Home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ReportAdapter extends FragmentStatePagerAdapter {
    int totaltabs=0;



    public ReportAdapter(@NonNull FragmentManager fm, int totaltabs) {
        super(fm);
        this.totaltabs = totaltabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WeeklyReportFragment();
            case 1:
                return new MonthlyReportFragment();
            default:
                return new WeeklyReportFragment();

        }

    }

    @Override
    public int getCount() {
        return totaltabs;
    }
}
