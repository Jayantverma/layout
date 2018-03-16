package com.example.jayantverma.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;

/**
 * Created by jayantverma on 14/03/18.
 */

public class newActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.user_profile);
    }
}
