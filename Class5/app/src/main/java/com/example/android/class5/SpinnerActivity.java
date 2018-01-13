package com.example.android.class5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Spinner;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.example.android.class5.R.id.myimg;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spCountry;
    ArrayList<ModelCountry> CountryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latout_spinner);

        spCountry = (Spinner) findViewById(R.id.sp_country);
        CountryList = new ArrayList<>();


        private void getCountries(){
        ArrayList<ModelCountry> CountryList = new ArrayList<>();
        ModelCountry modelCountry = new ModelCountry();



    }
         }
}
