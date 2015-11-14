package com.example.alphabets;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alphabets.model.EnglishAlphabet;

public class AlphabetFragment extends Fragment {

    private static final String TAG = "AlphabetFragment" ;
    private int mAlphabetIndex;

    public AlphabetFragment() {
        // Required empty public constructor
    }

    public static AlphabetFragment newInstance(int alphabetIndex) {
        Log.i(TAG,"newInstance");
        AlphabetFragment fragment = new AlphabetFragment();
        Bundle args = new Bundle();
        args.putInt("alphabet_index", alphabetIndex);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        mAlphabetIndex = getArguments().getInt("alphabet_index");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(TAG, "onCreateView");

        return inflater.inflate(R.layout.fragment_alphabet, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated");
        TextView tv = (TextView) view.findViewById(R.id.alphabet_textview);
        char letter = EnglishAlphabet.DATA[mAlphabetIndex].letter;
        tv.setText(String.valueOf(letter));


        int resId = EnglishAlphabet.DATA[mAlphabetIndex].image;
        ImageView iv = (ImageView) view.findViewById(R.id.alphabet_imageview);
        iv.setImageResource(resId);

    }
}
