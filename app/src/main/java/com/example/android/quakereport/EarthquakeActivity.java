/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);


        ListView earthquakeListView = (ListView) findViewById(R.id.earthquake_list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(this,getListItem());

        earthquakeListView.setAdapter(adapter);
    }

    @NonNull
    private ArrayList<EarthQuakeDetails> getListItem() {
        ArrayList<EarthQuakeDetails> earthquakes = new ArrayList<>();
        earthquakes.add(new EarthQuakeDetails("5.4","San Francisco","mar 5, 2017"));
        earthquakes.add(new EarthQuakeDetails("6.0","London","mar 5, 2017"));
        earthquakes.add(new EarthQuakeDetails("7.0","Tokyo","mar 5, 2017"));
        earthquakes.add(new EarthQuakeDetails("3.4","Mexico City","mar 5, 2017"));
        earthquakes.add(new EarthQuakeDetails("4.3","Moscow","mar 5, 2017"));
        earthquakes.add(new EarthQuakeDetails("6.2","Rio de Janeiro","mar 5, 2017"));
        earthquakes.add(new EarthQuakeDetails("5.0","Paris","mar 5, 2017"));
        return earthquakes;
    }
}
