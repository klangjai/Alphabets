package com.example.alphabets;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.i(TAG, "onCreate");
        Intent i = getIntent();
        int alphabetIndex = i.getIntExtra("alphabet_index", 0);

        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);

        AlphabetPagerAdapter adapter = new AlphabetPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(adapter);
        pager.setCurrentItem(alphabetIndex);

        TabLayout tabs = (TabLayout) findViewById(R.id.tab_layout);
        tabs.setupWithViewPager(pager);

    }


}
