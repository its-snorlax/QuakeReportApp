package com.example.android.quakereport;

import android.content.Context;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EarthquakeViewModel {

    private Earthquake earthquake;
    private Context context;

    public EarthquakeViewModel(Earthquake earthquake, Context context) {
        this.earthquake = earthquake;
        this.context = context;
    }

    public String formatMagnitude() {
        return new DecimalFormat("0.0").format(earthquake.getMagnitude());
    }

    public String getLocation(){
        if (hasOfString()) {
            return getLocationPart(1);
        }
        return earthquake.getLocation();
    }

    public String getLandmark() {
        if (hasOfString()) {
            return getLocationPart(0);
        }
        return context.getString(R.string.near_the);
    }

    public String formatDate() {
        Date dateObject = new Date(earthquake.getDate());
        return new SimpleDateFormat("LLL dd, yyyy").format(dateObject);
    }

    public String formatTime() {
        Date dateObject = new Date(earthquake.getDate());
        return new SimpleDateFormat("h:mm a").format(dateObject);
    }

    private String getLocationPart(int index) {
        return earthquake.getLocation().split("of")[index];
    }

    private boolean hasOfString() {
        return earthquake.getLocation().contains("of");
    }
}
