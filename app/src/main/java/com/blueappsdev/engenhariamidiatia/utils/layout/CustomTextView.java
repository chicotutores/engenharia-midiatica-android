package com.blueappsdev.engenhariamidiatia.utils.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import com.blueappsdev.engenhariamidiatia.R;

/**
 * Created by douglasnunes on 12/17/16.
 */

public class CustomTextView extends TextView {

    int fontFamily = 0;

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView, 0, 0);

        try{

            fontFamily = typedArray.getInt(R.styleable.CustomTextView_dinFamily, 0);

        } finally {

            setupFont(context);

        }
    }

    void setupFont(Context context){

        switch (fontFamily){

            case 0: //Default
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "font/DINPro-Regular.otf"));
                break;

            case 1:
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "font/DINPro-Medium.otf"));
                break;

            case 2:
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "font/DINPro-Light.otf"));
                break;

            case 3:
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "font/DINPro-Black.otf"));
                break;

            case 4:
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "font/DINPro-Bold.otf"));
                break;

        }

    }
}
