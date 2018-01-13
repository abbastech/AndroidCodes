package com.example.android.assignment2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    TextView tvName;
    TextView tvPassword;
    TextView tvConfirmPass;
    TextView tvDob;
    TextView tvGender;
    TextView tvCountry;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvName=(TextView) findViewById(R.id.tv_name);
        tvPassword= (TextView) findViewById(R.id.tv_password);
        tvConfirmPass = (TextView) findViewById(R.id.tv_confirm_password);
        tvDob = (TextView) findViewById(R.id.tv_DOB);
        tvGender = (TextView) findViewById(R.id.tv_gender);
        tvCountry = (TextView) findViewById(R.id.tv_country);





        Bundle b = getIntent().getExtras();
        String name = b.getString("name");
        String password = b.getString("password");
        String confirmpass = b.getString("confirmpass");
        String dob = b.getString("dob");
        String gender = b.getString("gender");
        String country = b.getString("country");

        tvName.setText(name);
        tvPassword.setText(password);
        tvConfirmPass.setText(confirmpass);
        tvDob.setText(dob);
        tvGender.setText(gender);
        tvCountry.setText(country);

    }
}
