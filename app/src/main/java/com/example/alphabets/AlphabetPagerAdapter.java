package com.example.alphabets;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.alphabets.model.EnglishAlphabet;

/**
 * Created by Promlert on 11/8/2015.
 */
public class AlphabetPagerAdapter extends FragmentStatePagerAdapter {

    public AlphabetPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        AlphabetFragment frag = AlphabetFragment.newInstance(position);
        return frag;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return EnglishAlphabet.DATA[position].toString();
    }

    @Override
    public int getCount() {
        return EnglishAlphabet.DATA.length;
    }
}
