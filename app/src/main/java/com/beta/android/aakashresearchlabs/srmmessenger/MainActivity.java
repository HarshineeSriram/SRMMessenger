package com.beta.android.aakashresearchlabs.srmmessenger;

import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        LinearLayout container = (LinearLayout) findViewById(R.id.constraint);

        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(1000);
        anim.setExitFadeDuration(1000);

        EditText et = (EditText) findViewById(R.id.textview3);
        et.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        TextView tx = (TextView)findViewById(R.id.textview1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/CENSCBK.TTF");
        tx.setTypeface(custom_font);

        tx = (TextView)findViewById(R.id.textview2);
        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/CENSCBK.TTF");
        tx.setTypeface(custom_font);

        tx = (TextView)findViewById(R.id.textview3);
        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/CENSCBK.TTF");
        tx.setTypeface(custom_font);

        tx = (TextView)findViewById(R.id.textview4);
        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/CENSCBK.TTF");
        tx.setTypeface(custom_font);

        //ImageView myImage = (ImageView) findViewById(R.id.myimage);
        //myImage.setAlpha(0.9f);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning())
            anim.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (anim != null && anim.isRunning())
            anim.stop();
    }
}
