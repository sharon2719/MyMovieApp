package com.example.mymovieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieAdapter extends BaseAdapter {
    Context context;
    String arrayMovies[];
    int movieIcons[];
    LayoutInflater inflater;

    public MovieAdapter(Context applicationContext,String [] arrayMovies, int movieIcons []){
        this.context=context;
        this.arrayMovies=arrayMovies;
        this.movieIcons=movieIcons;
        inflater=(LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return arrayMovies.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.activity_movielistview,null);
        TextView tvMovieTitle=(TextView)view.findViewById(R.id.tvMovieTitle);
        ImageView ivIcon=(ImageView)view.findViewById(R.id.ivIcon);
        tvMovieTitle.setText(arrayMovies[i]);
        ivIcon.setImageResource(movieIcons[i]);
        return view;
    }
}
