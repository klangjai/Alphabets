package com.example.alphabets;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alphabets.model.EnglishAlphabet;

/**
 * Created by Promlert on 11/8/2015.
 */
public class AlphabetListFragment extends ListFragment {

    private static final String TAG = "AlphabetListFragment";

    interface MyListener {
        public void onAlphabetListItemClicked(int position);
    }

    private MyListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate");


        ArrayAdapter<EnglishAlphabet> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                EnglishAlphabet.DATA
        );

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(
                getActivity(),
                "Position: " + position,
                Toast.LENGTH_SHORT
        ).show();


        listener.onAlphabetListItemClicked(position);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        listener = (MyListener) context;
    }
}
