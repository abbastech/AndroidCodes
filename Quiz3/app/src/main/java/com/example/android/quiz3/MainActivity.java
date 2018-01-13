package com.example.android.quiz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
        @Override
             protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fragment);

            FrameLayout top_layout = (FrameLayout) findViewById(R.id.frame_top);
            FrameLayout bottom_layout = (FrameLayout) findViewById(R.id.frame_Bottom);


            TopFragment topFragment = new TopFragment();
            BottomFragment bottomFragment = new BottomFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.frame_top,topFragment).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.frame_Bottom,bottomFragment).commit();

        }
}
