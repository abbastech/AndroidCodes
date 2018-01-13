package com.example.android.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText txtname;
    EditText txtemail;
    EditText txtpassword;
    Button btn;
    Spinner mySpinner;
    Spinner genderSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initilizing TextView
        txtname = (EditText) findViewById(R.id.txtname);
        txtemail = (EditText) findViewById(R.id.txtemail);
        txtpassword = (EditText) findViewById(R.id.txtpassword);
        btn = (Button) findViewById(R.id.button);

        //Sppinner Coding
        mySpinner = (Spinner) findViewById(R.id.spinner1);

        //Array Adapter for Spinner
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.names));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        //When
      /*  mySpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //String spinervalue = mySpinner.getSelectedItem();
            }
        });

        */
        //Button Event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namevalue = txtname.getText().toString();
                String emailvalue = txtemail.getText().toString();
                String spinervalue = (String) mySpinner.getSelectedItem();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Name",namevalue);
                intent.putExtra("Email",emailvalue);
                intent.putExtra("Country",spinervalue);

                startActivity(intent);
            }
        });

    }
}
