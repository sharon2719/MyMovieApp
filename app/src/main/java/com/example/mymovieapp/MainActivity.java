package com.example.mymovieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String [] arrayMovies={"Afterlife of the Party","Encanto","Free Guy"};
//    String [] arrayMovies={"Afterlife of the Party","Encanto","Free Guy","Moxie","Red Notice","The Kings man 3","The Kissing Booth 2","Thunder Force","Venom 2: Let there be carnage","Yes Day"};
//    ListView lvMoviesList;
    RecyclerView rvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovie=findViewById(R.id.rvMovies);

        MoviesRecyclerViewAdapter adapter=new MoviesRecyclerViewAdapter(getArrayMovies());
        rvMovie.setAdapter(adapter);
        rvMovie.setLayoutManager(new LinearLayoutManager(this));



//        lvMoviesList=(ListView) findViewById(R.id.lvMoviesList);
//        MovieAdapter movieAdapter= new MovieAdapter (getApplicationContext(),arrayMovies,
//                Constants.movieIcons);
//        lvMoviesList.setAdapter(movieAdapter);
//
//        lvMoviesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> a, View v, int position,
//                                    long id) {
//                Log.e("position", arrayMovies[position]);
//
//                Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
//                intent.putExtra("MovieName",arrayMovies[position]);
//                intent.putExtra("position",position);
//                startActivity(intent);
//            }
//        });

    }
    public ArrayList<Movie> getArrayMovies(){
        ArrayList<Movie> movies=new ArrayList<>();
        Movie movie1=new Movie("Afterlife of the party","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                "Jane Doe","2021",R.drawable.afterlife);
        Movie movie2=new Movie("Encanto","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                "Rita Smith","2021",R.drawable.encanto);
        Movie movie3=new Movie("Fee Guy","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                "Mike John","2021",R.drawable.freeguy);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        return  movies;
    }
}