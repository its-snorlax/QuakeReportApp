package com.example.android.quakereport;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by prayas on 24/1/18.
 */

public class EarthquakeViewModel {

    public String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }

    private String[] parts = new String[2];
    public String formatLocation(String location, int i){
           if(location.contains("of")){
               parts = location.split("of");
           }else {
               parts[0] = "Near the";
               parts[1] = location;
           }
        return parts[i];
    }
    

    public String formatDate(long date) {
        Date dateObject = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
    
    public String formatTime(Long date) {
        Date dateObject = new Date(date);
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
