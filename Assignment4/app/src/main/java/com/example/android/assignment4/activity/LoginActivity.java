package com.example.android.assignment4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.example.ubaid.assignment4.R;
//import com.example.android.assignment4.R;
//import com.example.ubaid.assignment4.model.User;

import com.example.android.assignment4.R;
import com.example.android.assignment4.model.User;

import io.realm.Realm;


public class LoginActivity extends AppCompatActivity {

    EditText etUsername;
    EditText etPassword;
    Realm realm;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);

        Realm.init(this);
        realm = Realm.getDefaultInstance();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etUsername = (EditText) findViewById(R.id.et_username);
                etPassword = (EditText) findViewById(R.id.et_password);
                User user = realm.where(User.class).equalTo("userName", etUsername.getText().toString()).findFirst();
                User user1 = realm.where(User.class).equalTo("userPassword", etPassword.getText().toString()).findFirst();
                if(user != null && user1 != null){
                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(),"Sorry not available",Toast.LENGTH_SHORT).show();
                }



            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });

    }



}
