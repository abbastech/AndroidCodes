package com.example.android.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.assignment2.R.id.lblspinner;

public class SecondActivity extends AppCompatActivity {

    TextView lblname,lblemail,lblspinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lblname = (TextView) findViewById(R.id.lblname);
        lblemail = (TextView) findViewById(R.id.lblemail);
        lblspinner = (TextView) findViewById(R.id.lblspinner);

        lblname.setText("Hello "+getIntent().getStringExtra("Name"));
        lblemail.setText("Your Email is "+getIntent().getStringExtra("Email"));
        lblspinner.setText("Your Country is "+getIntent().getStringExtra("Country"));


    }
}
