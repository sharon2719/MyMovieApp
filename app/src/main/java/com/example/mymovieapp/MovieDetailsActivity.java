package com.example.mymovieapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        TextView tvMovieName=findViewById(R.id.tvMovieName);
        ImageView ivMovieIcon=findViewById(R.id.ivMovieIcon);

        Intent movieDetailsIntent= getIntent();
        String movieName= movieDetailsIntent.getStringExtra("MovieName");
        int movieIndex= movieDetailsIntent.getIntExtra("position",0);
        tvMovieName.setText(movieName);
        ivMovieIcon.setImageResource(Constants.movieIcons[movieIndex]);






    }
}
