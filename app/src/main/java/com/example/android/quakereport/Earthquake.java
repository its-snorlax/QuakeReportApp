package com.example.android.quakereport;

import java.text.DateFormat;

/**
 * Created by prayas on 20/1/18.
 */

public class Earthquake {
    private double magnitude;
    private String place;
    private Long date;
    private String url;
    public Earthquake(double magnitude, String place, Long date, String url){
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
        this.url = url;
    }



    public double getMagnitude(){
        return magnitude;
    }

    public String getLocation(){return place; }

    public Long getDate(){
        return date;
    }

    public String getUrl(){
        return url;
    }
}
