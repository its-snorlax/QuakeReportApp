package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by prayas on 20/1/18.
 */

public class EarthquakeAdapter extends ArrayAdapter<EarthQuakeDetails> {

    public EarthquakeAdapter(@NonNull Context context, List<EarthQuakeDetails> earthquakeList) {
        super(context,0,earthquakeList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item,parent,false);
        }

        EarthQuakeDetails currentItem = getItem(position);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentItem.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(currentItem.getPlace());

        TextView dateView= (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentItem.getDate());

        return listItemView;
    }
}
