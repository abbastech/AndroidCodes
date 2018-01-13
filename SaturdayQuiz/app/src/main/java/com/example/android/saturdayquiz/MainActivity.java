package com.example.android.saturdayquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Example examples;
    List<Offer> list;
    EditText editTextsearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        editTextsearch = (EditText) findViewById(R.id.editextsearch);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String url = "https://api.savrrr.com/public/offers/list";
        StringRequest request = new StringRequest("https://api.savrrr.com/public/offers/list", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();

                examples = gson.fromJson(response, Example.class);
               list = examples.getData().getOffers();

                recyclerView.setAdapter(new recycleradapter(MainActivity.this,list));



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);


       editTextsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                filterdata(editable.toString());

            }
        });
    }


    public void filterdata(String s){

        List<Offer> filteredlist = new ArrayList<>();
        for(Offer a: list){

            if(a.getOfferTitle().toLowerCase().contains(s.toLowerCase())){

                filteredlist.add(a);
                recyclerView.setAdapter(new recycleradapter(MainActivity.this, filteredlist));

            }

        }

    }}
