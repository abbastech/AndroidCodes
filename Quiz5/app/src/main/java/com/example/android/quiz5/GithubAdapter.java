package com.example.android.quiz5;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

/**
 * Created by Ahmed Abbas on 12/16/2017.
 */

public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.GithubViewHolder> {
    private Context context;
    private User[] data;

    public GithubAdapter(Context context,User[] data){
        this.context = context;
        this.data = data;
    }
    @Override
    public GithubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.user_layout,parent,false);
        return new GithubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GithubViewHolder holder, int position) {
        User user = data[position];
        holder.txtUser.setText(user.getLogin());
        Glide.with(holder.imgUser.getContext()).load(user.getAvatarUrl()).into(holder.imgUser);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class GithubViewHolder extends RecyclerView.ViewHolder{
        ImageView imgUser;
        TextView txtUser;
        public GithubViewHolder(View itemView) {
            super(itemView);

            txtUser =(TextView) itemView.findViewById(R.id.txtuser);
            imgUser =(ImageView) itemView.findViewById(R.id.imgUser);
        }
    }

  /*  public void filterlist(User[] filteredlist){
        this.data = filteredlist;
        notifyDataSetChanged();
    }*/
}

