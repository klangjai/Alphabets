package com.example.alphabets;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.example.alphabets.model.EnglishAlphabet;

/**
 * Created by Promlert on 11/8/2015.
 */
public class AlphabetPagerAdapter extends FragmentStatePagerAdapter {

    private static final String TAG = "AlphabetPagerAdapter";

    public AlphabetPagerAdapter(FragmentManager fm) {
        super(fm);
        Log.i(TAG, "constructer");

    }

    @Override
    public Fragment getItem(int position) {
        AlphabetFragment frag = AlphabetFragment.newInstance(position);
        Log.i(TAG, "getItem");

        return frag;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(EnglishAlphabet.DATA[position].letter);
    }

    @Override
    public int getCount() {
        return EnglishAlphabet.DATA.length;
    }
}
