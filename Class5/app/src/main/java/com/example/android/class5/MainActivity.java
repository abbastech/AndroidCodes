package com.example.android.class5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView myimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Picasso.with(this)
                .load("http://www.wwe.com/f/styles/gallery_img_s/public/all/2017/01/John_Cena_stat--53eefb07344f336ed7edf78a0474c6b6.png")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(myimg);
    }
}
