package com.example.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new Fragment1();
            case 1 :return new Fragment2();
            case 2 :return new Fragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
