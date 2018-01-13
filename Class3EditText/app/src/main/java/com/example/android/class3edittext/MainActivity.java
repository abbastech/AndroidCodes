package com.example.android.class3edittext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtname;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname=(EditText) findViewById(R.id.txtname);
        btn = (Button) findViewById(R.id.btn);

         btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txtnameEntered = txtname.getText().toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                Bundle b = new Bundle();
                b.putString("Name",txtnameEntered);
                i.putExtras(b);
                startActivity(i);

            }
        });
    }
}
