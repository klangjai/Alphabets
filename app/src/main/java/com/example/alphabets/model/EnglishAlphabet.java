package com.example.alphabets.model;


import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.graphics.drawable.DrawableUtils;

import com.example.alphabets.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Promlert on 11/8/2015.
 */
public class EnglishAlphabet {
    public final char letter;
    public final int image;

    public EnglishAlphabet(char letter, int image){
        this.letter = letter;
        this.image = image;
    }
    public static EnglishAlphabet[] DATA;



    static {
        DATA = new EnglishAlphabet[26];
        DATA[0]= new EnglishAlphabet('A', R.drawable.arm);
        DATA[1]= new EnglishAlphabet('B', R.drawable.blue);
        DATA[2]= new EnglishAlphabet('C', R.drawable.cat);
        DATA[3]= new EnglishAlphabet('D', R.drawable.dog);
        DATA[4]= new EnglishAlphabet('E', R.drawable.ear);
        DATA[5]= new EnglishAlphabet('F', R.drawable.foot);
        DATA[6]= new EnglishAlphabet('G', R.drawable.grey);
        DATA[7]= new EnglishAlphabet('H', R.drawable.hand);
    }

    public String toString(){
        return String.valueOf(letter);
    }
}
