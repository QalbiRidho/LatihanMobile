package com.ridho.qalbi.listfilm;

import java.io.Serializable;

/**
 * Created by D2J-00 on 09/02/2017.
 */
public class Movie implements Serializable{
    public String tittle;
    public String description;
    public double rating;
    public int year;

    public Movie(String tittle, String description, double rating, int year){
        this.tittle = tittle;
        this.description = description;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString(){
        return this.tittle;
    }
}
