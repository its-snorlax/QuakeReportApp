package com.example.android.quakereport;

import java.text.DateFormat;

/**
 * Created by prayas on 20/1/18.
 */

public class EarthQuakeDetails {
    private String magnitude;
    private String place;
    private String date;

    public EarthQuakeDetails(String magnitude, String place, String date){
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
    }

    public String getMagnitude(){
        return magnitude;
    }

    public String getPlace(){
        return place;
    }

    public String getDate(){
        return date;
    }

}
