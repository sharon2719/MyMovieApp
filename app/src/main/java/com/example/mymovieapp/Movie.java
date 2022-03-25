package com.example.mymovieapp;

import java.io.Serializable;

public class Movie  implements Serializable {
    String name;
    String details;
    String director;
    String year;
    int icon;


    public Movie(String name, String details, String director, String year,int icon) {
        this.name = name;
        this.details = details;
        this.director = director;
        this.year = year;
        this.icon= icon;
    }

}
