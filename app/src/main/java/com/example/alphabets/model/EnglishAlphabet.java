package com.example.alphabets.model;


import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.example.alphabets.R;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Promlert on 11/8/2015.
 */
public class EnglishAlphabet {

    public final char letter;
    public final int image;
    private static int i = 0;
    public EnglishAlphabet(char letter, int image) {
        this.letter = letter;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.valueOf(letter);
    }

    public static final EnglishAlphabet[] DATA = {

            new EnglishAlphabet('A', R.drawable.arm),
            new EnglishAlphabet('B', R.drawable.blue),
            new EnglishAlphabet('C', R.drawable.cat),
            new EnglishAlphabet('D', R.drawable.dog),
            new EnglishAlphabet('E', R.drawable.ear),
            new EnglishAlphabet('F', R.drawable.foot),
            new EnglishAlphabet('G', R.drawable.grey),
            new EnglishAlphabet('H', R.drawable.hand),
            new EnglishAlphabet('I', R.drawable.ink),
            new EnglishAlphabet('J', R.drawable.jar),
            new EnglishAlphabet('K', R.drawable.koala),
            new EnglishAlphabet('L', R.drawable.lion),
            new EnglishAlphabet('M', R.drawable.mouth),
            new EnglishAlphabet('N', R.drawable.nose),
            new EnglishAlphabet('O', R.drawable.owl),
            new EnglishAlphabet('P', R.drawable.pig),
            new EnglishAlphabet('Q', R.drawable.queen),
            new EnglishAlphabet('R', R.drawable.rabbit),
            new EnglishAlphabet('S', R.drawable.snake),
            new EnglishAlphabet('T', R.drawable.tiger),
            new EnglishAlphabet('U', R.drawable.unicorn),
            new EnglishAlphabet('V', R.drawable.van),
            new EnglishAlphabet('W', R.drawable.wood),
            new EnglishAlphabet('X', R.drawable.xray),
            new EnglishAlphabet('Y', R.drawable.yellow),
            new EnglishAlphabet('Z', R.drawable.zoo),
    };
}
