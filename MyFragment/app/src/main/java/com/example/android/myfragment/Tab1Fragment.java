package com.example.android.myfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Ahmed Abbas on 11/17/2017.
 */

public class Tab1Fragment extends Fragment {
    private static final String  TAG = "Tab 1 Fragment";
    private Button btntest;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
        btntest = (Button)  view.findViewById(R.id.btn1);

        return view;
    }
}
