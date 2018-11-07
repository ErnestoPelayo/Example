package com.example.macbook.example;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    android.content.Context context;
    ArrayList<Profile> profiles;

    public Myadapter(android.content.Context c, ArrayList<Profile> p){

        context=c;
        profiles=p;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(profiles.get(position).getName());
        holder.email.setText(profiles.get(position).getEmail());
     //   Picasso.get().load(profiles.get(position).getProfilePic().into(holder.profilePic));
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name,email;
        ImageView profilePic;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name= itemView.findViewById(R.id.name);
            email= itemView.findViewById(R.id.email);
            profilePic = itemView.findViewById(R.id.profilesPic);


        }
    }
}
