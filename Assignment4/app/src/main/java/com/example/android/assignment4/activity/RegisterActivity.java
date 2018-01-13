package com.example.android.assignment4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.example.ubaid.assignment4.R;
import com.example.android.assignment4.R;
import com.example.android.assignment4.model.User;
//import com.example.ubaid.assignment4.model.User;

import io.realm.Realm;


public class RegisterActivity extends AppCompatActivity {

    EditText etUserName, etPassword, etEmail;
    Button btnRegister;
    Realm realm;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        etUserName = (EditText) findViewById(R.id.et_username);
        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_password);

        btnRegister= (Button) findViewById(R.id.btn_register);


        Realm.init(this);
        realm = Realm.getDefaultInstance();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUserName.equals("") || etEmail.equals("") || etPassword.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter the data correctly", Toast.LENGTH_LONG).show();
                } else {
                    realm.beginTransaction();

                    user = realm.createObject(User.class);
                    user.setUserName(etUserName.getText().toString());
                    user.setUserEmail(etEmail.getText().toString());
                    user.setUserPassword(etPassword.getText().toString());

                    realm.commitTransaction();
                    Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(i);

                    finish();

                }
            }
        });
    }


}
