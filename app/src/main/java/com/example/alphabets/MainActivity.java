package com.example.alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity
        implements AlphabetListFragment.MyListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
    }

    private void loadFragment(int i) {
        Log.i(TAG,"loadFragment");
        AlphabetFragment frag = AlphabetFragment.newInstance(i);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_container, frag);
        transaction.commit();
    }

    @Override
    public void onAlphabetListItemClicked(int position) {
        Log.i(TAG,"onItemClick");

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
