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

public class GenderSpinnerAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<ModelGender> genderList;
    LayoutInflater mInflater;

    public GenderSpinnerAdapter(Context context, ArrayList<ModelGender> genders){
        mContext = context;
        genderList = genders;
        mInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return genderList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return genderList.get(i).getGenderId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View mView = mInflater.inflate(R.layout.row_spinner, null);
        TextView tv = mView.findViewById(R.id.tv_row_spinner);
        tv.setText(genderList.get(position).getGenderName());
        return mView;
    }
}
