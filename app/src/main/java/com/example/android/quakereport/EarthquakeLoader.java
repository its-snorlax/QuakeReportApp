package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;


public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    public EarthquakeLoader(Context context,String url) {
        super(context);
        this.url = url;
    }

    private String url;
    private static final int EARTHQUAKE_LOADER_ID = 1;

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (url == null) {
            return null;
        }
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(url);
        return earthquakes;
    }
}
