package com.example.android.quakereport;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by prayas on 20/1/18.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, List<Earthquake> earthquakeList) {
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

        Earthquake currentItem = getItem(position);
        EarthquakeViewModel viewModel = new EarthquakeViewModel();

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        String formattedMagnitude = viewModel.formatMagnitude(currentItem.getMagnitude());
        magnitudeView.setText(formattedMagnitude);

        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();
        int magnitudeColor = getMagnitudeColor(currentItem.getMagnitude());
        magnitudeCircle.setColor(magnitudeColor);

        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.location1);
        String formattedPrimaryLocation = viewModel.formatLocation(currentItem.getLocation(),1);
        primaryLocationView.setText(formattedPrimaryLocation);

        TextView secondaryLocationView = (TextView) listItemView.findViewById(R.id.location2);
        String secondaryLocation = viewModel.formatLocation(currentItem.getLocation(),0);
        secondaryLocationView.setText(secondaryLocation);


        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String formattedDate = viewModel.formatDate(currentItem.getDate());
        dateView.setText(formattedDate);

        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        String formattedTime = viewModel.formatTime(currentItem.getDate());
        timeView.setText(formattedTime);

        return listItemView;
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }

        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }


}