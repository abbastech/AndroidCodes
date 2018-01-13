package com.example.android.finalexampractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Example examples;
    List<Offer> list;
    EditText editTextsearch;
    RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextsearch = (EditText) findViewById(R.id.editextsearch);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        queue = Volley.newRequestQueue(this);
        String url = "https://api.savrrr.com/public/offers/list";
        StringRequest request = new StringRequest("https://api.savrrr.com/public/offers/list", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                Log.d("Response", response);
                examples = gson.fromJson(response, Example.class);
                list = examples.getData().getOffers();

                recyclerView.setAdapter(new recycleradapter(MainActivity.this, list));


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

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


    public void postdata(View v) throws JSONException {

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        PersonMOdel personMOdel = new PersonMOdel();
        personMOdel.setName("rathore");
        personMOdel.setCaste("rowdy");
        personMOdel.setColor("white");
        String jsonstring = gson.toJson(personMOdel);

        JSONObject jsonObject1 = new JSONObject(jsonstring);

        String url = "http://httpbin.org/post";


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonObject1, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("Response", response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


       /* StringRequest postrequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Log.d("Response", response);
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d("Error Response", error.getLocalizedMessage());

            }
        }) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                params.put("name", "akshay");
                params.put("caste", "batra");


                return params;


            }
        };
*/
        queue.add(jsonObjectRequest);

    }

    public void filterdata(String s) {

        List<Offer> filteredlist = new ArrayList<>();
        for (Offer a : list) {

            if (a.getOfferTitle().toLowerCase().contains(s.toLowerCase())) {

                filteredlist.add(a);
                recyclerView.setAdapter(new recycleradapter(MainActivity.this, filteredlist));

            }

        }

    }
}
