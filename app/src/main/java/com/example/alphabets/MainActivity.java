package com.example.alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.alphabets.model.EnglishAlphabet;


public class MainActivity extends AppCompatActivity
        implements AlphabetListFragment.MyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void loadFragment(int i) {
        AlphabetFragment frag = AlphabetFragment.newInstance(i);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_container, frag);
        transaction.commit();
    }

    @Override
    public void onAlphabetListItemClicked(int position) {
        if (findViewById(R.id.fragment_container) == null) {
            // หน้าจอแนวตั้ง มีเฉพาะ List
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("alphabet_index", position);
            startActivity(i);

        } else {
            // หน้าจอแนวนอน มีทั้ง List และ Detail
            loadFragment(position);
        }


    }
}
