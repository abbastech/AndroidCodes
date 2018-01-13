package com.example.android.assignmentnew2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tv_Welcome,tv_Password,tv_DOB,tv_Gender,tv_Country,tv_City;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tv_Welcome = (TextView)findViewById(R.id.tv_welcome);
        tv_Password = (TextView)findViewById(R.id.tv_password);
        tv_DOB = (TextView)findViewById(R.id.tv_DOB);
        tv_Gender = (TextView)findViewById(R.id.tv_gender);
        tv_Country = (TextView) findViewById(R.id.tv_country);
        tv_City = (TextView)findViewById(R.id.tv_city);

        Bundle b = getIntent().getExtras();

        tv_Welcome.setText(tv_Welcome.getText() + b.getString("FirstName") +" "+ b.getString("SecondName"));
        tv_Password.setText(tv_Password.getText() + b.getString("Password"));
        tv_DOB.setText(tv_DOB.getText() + b.getString("DOB"));
        tv_Gender.setText(tv_Gender.getText() + b.getString("Gender"));
        tv_Country.setText(tv_Country.getText() + b.getString("Country"));
        tv_City.setText(tv_City.getText() + b.getString("City"));
    }
}
