package com.example.android.assignmentnew2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ahmed on 10/13/2017.
 */

public class CountrySpinnerAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<ModelCountry> countryList;
    LayoutInflater mInflater;

    public CountrySpinnerAdapter(Context context, ArrayList<ModelCountry> countries){
        mContext = context;
        countryList = countries;
        mInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return countryList.get(i).getCountryId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View mView = mInflater.inflate(R.layout.row_spinner, null);
        TextView tv = mView.findViewById(R.id.tv_row_spinner);
        tv.setText(countryList.get(position).getCountryName());
        return mView;
    }
}
