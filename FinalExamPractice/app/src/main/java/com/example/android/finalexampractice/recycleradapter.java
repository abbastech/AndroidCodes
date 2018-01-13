package com.example.android.finalexampractice;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Ahmed Abbas on 12/16/2017.
 */

public class recycleradapter extends RecyclerView.Adapter<recycleradapter.myviewholder> {
    Context context;
    List<Offer> list;
    public recycleradapter(Context context,List<Offer> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_recycler,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(myviewholder holder, int position) {
       holder.txttitle.setText(list.get(position).getOfferDescription());
        holder.txtdescription.setText(list.get(position).getOfferTitle());

        String baseurl = "http://www.savrrr.com";
        Picasso.with(context).load(baseurl.concat(list.get(position).getThumbnail().getLink())).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView txttitle,txtdescription;

        public myviewholder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageview1);
            txttitle = (TextView) itemView.findViewById(R.id.txttitle);
            txtdescription = (TextView) itemView.findViewById(R.id.txtdescription);
        }
    }
}
