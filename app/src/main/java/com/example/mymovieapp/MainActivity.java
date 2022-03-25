package com.example.mymovieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] arrayMovies={"Afterlife of the Party","Encanto","Free Guy","Moxie","Red Notice","The Kings man 3","The Kissing Booth 2","Thunder Force","Venom 2: Let there be carnage","Yes Day"};
    ListView lvMoviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMoviesList=(ListView) findViewById(R.id.lvMoviesList);
        MovieAdapter movieAdapter= new MovieAdapter (getApplicationContext(),arrayMovies,
                Constants.movieIcons);
        lvMoviesList.setAdapter(movieAdapter);

        lvMoviesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Log.e("position", arrayMovies[position]);

                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
                intent.putExtra("MovieName",arrayMovies[position]);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });




//        ArrayAdapter<String>movieItemsAdapter=
//                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayMovies);
//        ListView lvMoviesList=(ListView) findViewById(R.id.lvMoviesList);
//        lvMoviesList.setAdapter(movieItemsAdapter);
    }
}