package com.example.android.saturdayquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Ahmed Abbas on 12/30/2017.
 */

public class LoginActivity extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    Button btn;
    ExampleLogin examples;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        btn = (Button) findViewById(R.id.buttonLogin);

        //if user press login
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = editTextUsername.getText().toString();
                final String password = editTextPassword.getText().toString();
                if (TextUtils.isEmpty(username)) {
                    editTextUsername.setError("Please enter your username");
                    editTextUsername.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    editTextPassword.setError("Please enter your password");
                    editTextPassword.requestFocus();
                    return;
                }

                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });

    }

   /* private void userLogin() throws JSONException {
        final String username = editTextUsername.getText().toString();
        final String password = editTextPassword.getText().toString();
        String url = "http://api.savrrr.com/public/login";
        //validating inputs
        if (TextUtils.isEmpty(username)) {
            editTextUsername.setError("Please enter your username");
            editTextUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            editTextPassword.setError("Please enter your password");
            editTextPassword.requestFocus();
            return;
        }

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        PersonModel person = new PersonModel();
        person.setUsername(username);
        person.setPassword(password);

        String jsonstring = gson.toJson(person);
        JSONObject jsonObject1 = new JSONObject(jsonstring);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonObject1, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }   */
}
