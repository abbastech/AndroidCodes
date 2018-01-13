package com.example.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mylistview  = (ListView) findViewById(R.id.mylistview);

        final ArrayList<String> myfamily = new ArrayList<String>();
        myfamily.add("Bob");
        myfamily.add("Christan");
        myfamily.add("Tommy");
        myfamily.add("Ralphie");
        myfamily.add("Wajahat");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myfamily);

        mylistview.setAdapter(arrayAdapter);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position,long id){
                Toast.makeText(MainActivity.this, "you select "+myfamily.get(position), Toast.LENGTH_SHORT).show();

            }
        });





    }
}
