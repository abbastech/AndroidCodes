package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ahmed Abbas on 10/21/2017.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder>{
    private String[] data;
    public  ProgrammingAdapter(String[] data){
        this.data = data;
    }


    // Ye method hamare viewholder create krta hai, means unko store krta hai
    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title = data[position];
        holder.txttitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    //Is class mai hm jis layout k elements mai data dalna hota hai,wo
    // yaha define krte hain
    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgicon;
        TextView txttitle;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);

            imgicon = (ImageView) itemView.findViewById(R.id.imgicon);
            txttitle = (TextView) itemView.findViewById(R.id.txttitle);


        }
    }
}
