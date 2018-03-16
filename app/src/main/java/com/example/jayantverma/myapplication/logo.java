package com.example.jayantverma.myapplication;

import android.app.IntentService;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.content.Intent;

/**
 * Created by jayantverma on 15/03/18.
 */

public class logo extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.logo);

        final ImageView imageview = (ImageView) findViewById(R.id.imageView3);
        final Animation animation1 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.bounce);
        imageview.startAnimation(animation1);
        animation1.setAnimationListener(new Animation.AnimationListener(){


            @Override
            public void onAnimationStart(Animation animation) {

                Log.v("-->>","onAnimationStart");

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}
