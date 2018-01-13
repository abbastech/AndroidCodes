package com.example.android.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {



    EditText etName;
    EditText etPassword;
    EditText etConfirmPass;
    EditText etDob;
    EditText etGender;
    EditText etCountry;
    Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext=(Button) findViewById(R.id.button_1);

        etName = (EditText) findViewById(R.id.et_edittext1);
        etPassword = (EditText) findViewById(R.id.et_edittext2);
        etConfirmPass = (EditText) findViewById(R.id.et_edittext3);
        etDob = (EditText) findViewById(R.id.et_edittext4);
        etGender = (EditText) findViewById(R.id.et_edittext5);
        etCountry = (EditText) findViewById(R.id.et_edittext6);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enteredText=etName.getText().toString()+"";
                String enteredTextPassword=etPassword.getText().toString()+"";
                String enteredTextConfirmPass=etConfirmPass.getText().toString()+"";
                String enteredTextDob=etDob.getText().toString()+"";
                String enteredTextGender=etGender.getText().toString()+"";
                String enteredTextCountry=etCountry.getText().toString()+"";

                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                Bundle b = new Bundle();
                b.putString("name", enteredText);
                b.putString("password", enteredTextPassword);
                b.putString("confirmpass", enteredTextConfirmPass);
                b.putString("dob", enteredTextDob);
                b.putString("gender", enteredTextGender);
                b.putString("country", enteredTextCountry);


                i.putExtras(b);
                startActivity(i);

            }


        });

    }


}