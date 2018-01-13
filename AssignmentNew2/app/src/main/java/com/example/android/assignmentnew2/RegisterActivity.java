package com.example.android.assignmentnew2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    EditText etFirstName,etSecondName,etPassword,etConfirmPassword,etDOB, etCity;
    Spinner spCountry,spGender;
    Button btnRegister;
    ArrayList<ModelCountry> CountryList;
    ArrayList<ModelGender> GenderList;
    CountrySpinnerAdapter countrySpinnerAdapter;
    GenderSpinnerAdapter genderSpinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etFirstName = (EditText)findViewById(R.id.etFirstName);
        etSecondName = (EditText)findViewById(R.id.etSecondName);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        etDOB = (EditText)findViewById(R.id.etDOB);
        etCity = (EditText)findViewById(R.id.etCity);
        spCountry = (Spinner) findViewById(R.id.sp_Country);
        spGender = (Spinner) findViewById(R.id.sp_Gender);
        btnRegister = (Button)findViewById(R.id.btnRegister);

        CountryList = new ArrayList<>();
        CountryList = getCountries();

        GenderList = new ArrayList<>();
        GenderList = getGenders();

        countrySpinnerAdapter = new CountrySpinnerAdapter(this,CountryList);
        genderSpinnerAdapter = new GenderSpinnerAdapter(this,GenderList);
        spCountry.setAdapter(countrySpinnerAdapter);
        spGender.setAdapter(genderSpinnerAdapter);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etFirstName.getText().toString().isEmpty()){
                    etFirstName.setError("Field cannot be left blank!");
                }else {
                    etFirstName.setError(null);
                }
                if(etSecondName.getText().toString().isEmpty()){
                    etSecondName.setError("Field cannot be left blank!");
                }else {
                    etSecondName.setError(null);
                }
                if(etPassword.getText().toString().isEmpty()){
                    etPassword.setError("Field cannot be left blank!");
                }else {
                    etPassword.setError(null);
                }
                if(etConfirmPassword.getText().toString().isEmpty()){
                    etConfirmPassword.setError("Field cannot be left blank!");
                }else {
                    etConfirmPassword.setError(null);
                }
                if(etDOB.getText().toString().isEmpty()){
                    etDOB.setError("Field cannot be left blank!");
                }else {
                    etDOB.setError(null);
                }
                if(etCity.getText().toString().isEmpty()){
                    etCity.setError("Field cannot be left blank!");
                }else {
                    etCity.setError(null);
                }
                if(!etPassword.getText().toString().equals(etConfirmPassword.getText().toString())){
                    etConfirmPassword.setError("Passwords do not match");
                }else{
                    etConfirmPassword.setError(null);
                }
                if(spGender.getSelectedItemId() == -1){
                    Toast.makeText(RegisterActivity.this,"Please Select Gender!", Toast.LENGTH_SHORT).show();
                }
                if(spCountry.getSelectedItemId() == -1){
                    Toast.makeText(RegisterActivity.this,"Please Select Country!", Toast.LENGTH_SHORT).show();
                }
                if(etFirstName.getError() == null &&
                        etSecondName.getError() == null &&
                        etPassword.getError() == null &&
                        etConfirmPassword.getError() == null &&
                        etDOB.getError() == null &&
                        spGender.getSelectedItemId() != -1 &&
                        spCountry.getSelectedItemId() != -1 &&
                        etCity.getError() == null){
                    Intent i = new Intent(RegisterActivity.this, DisplayActivity.class);
                    Bundle b = new Bundle();
                    b.putString("FirstName", etFirstName.getText().toString());
                    b.putString("SecondName", etSecondName.getText().toString());
                    b.putString("Password", etPassword.getText().toString());
                    b.putString("DOB", etDOB.getText().toString());
                    b.putString("Gender", GenderList.get(spGender.getSelectedItemPosition()).getGenderName());
                    b.putString("Country", CountryList.get(spCountry.getSelectedItemPosition()).getCountryName());
                    b.putString("City", etCity.getText().toString());
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });


    }

    private ArrayList<ModelCountry> getCountries(){
        ArrayList<ModelCountry> countryArrayList = new ArrayList<>();
        ModelCountry modelCountry = new ModelCountry();
        modelCountry.setCountryId(-1);
        modelCountry.setCountryName("Select Country");
        countryArrayList.add(modelCountry);

        modelCountry = new ModelCountry();
        modelCountry.setCountryId(1);
        modelCountry.setCountryName("Pakistan");
        countryArrayList.add(modelCountry);

        modelCountry = new ModelCountry();
        modelCountry.setCountryId(2);
        modelCountry.setCountryName("Australia");
        countryArrayList.add(modelCountry);

        modelCountry = new ModelCountry();
        modelCountry.setCountryId(3);
        modelCountry.setCountryName("Turkey");
        countryArrayList.add(modelCountry);

        modelCountry = new ModelCountry();
        modelCountry.setCountryId(4);
        modelCountry.setCountryName("USA");
        countryArrayList.add(modelCountry);

        return  countryArrayList;
    }

    private ArrayList<ModelGender> getGenders(){
        ArrayList<ModelGender> genderArrayList = new ArrayList<>();
        ModelGender modelGender = new ModelGender();
        modelGender.setGenderId(-1);
        modelGender.setGenderName("Select Gender");
        genderArrayList.add(modelGender);

        modelGender = new ModelGender();
        modelGender.setGenderId(1);
        modelGender.setGenderName("Male");
        genderArrayList.add(modelGender);

        modelGender = new ModelGender();
        modelGender.setGenderId(2);
        modelGender.setGenderName("Female");
        genderArrayList.add(modelGender);
        return genderArrayList;
    }
}
