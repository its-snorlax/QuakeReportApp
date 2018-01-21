package com.example.android.quakereport;

import java.text.DateFormat;

/**
 * Created by prayas on 20/1/18.
 */

public class EarthQuake {
    private double magnitude;
    private String place;
    private Long date;

    public EarthQuake(double magnitude, String place, Long date){
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
    }



    public double getMagnitude(){
        return magnitude;
    }

    public String getPlace(){
        return place;
    }

    public Long getDate(){
        return date;
    }

}