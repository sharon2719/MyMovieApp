package com.example.mymovieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesRecyclerViewAdapter  extends
        RecyclerView.Adapter<MoviesRecyclerViewAdapter.ViewHolder>  {

    // Define the listener interface
    public interface OnItemClickListener {
        void onItemClick(View itemView, int position);
    }

    // Define listener member variable
    private OnItemClickListener listener;

    // Define the method that allows the parent activity or fragment to define the listener
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    private ArrayList<Movie> mMovies;

    // Pass in the contact array into the constructor
    public MoviesRecyclerViewAdapter(ArrayList<Movie> movies) {
        mMovies = movies;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View movieView = inflater.inflate(R.layout.movie_row, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(movieView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie= mMovies.get(position);
        holder.imgIcon.setImageResource(movie.icon);
        holder.tvMovieName.setText(movie.name);

    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
       public TextView tvMovieName;
       public ImageView imgIcon;
       private Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvMovieName=itemView.findViewById(R.id.tvMovieTitle1);
            this.imgIcon=itemView.findViewById(R.id.imgIcon);
            this.context=context;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            if (position!=RecyclerView.NO_POSITION){
                Movie movie= mMovies.get(position);

            }
        }
    }
}
