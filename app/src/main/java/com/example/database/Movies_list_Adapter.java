package com.example.database;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class Movies_list_Adapter extends
        RecyclerView.Adapter<Movies_list_Adapter.MoviesViewHolder> {
    ArrayList<Movies> movies;

    public Movies_list_Adapter(ArrayList<Movies> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.movie_list_item,parent,false);
        MoviesViewHolder viewHolder=new MoviesViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
   Movies m = movies.get(position);
   holder.img.setImageResource(m.getImg());
   holder.tv.setText(m.getName());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MoviesViewHolder extends RecyclerView.ViewHolder {
     TextView tv;
     ImageView img;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.movie_txt);
            img=itemView.findViewById(R.id.imageview);

        }

    }
}
