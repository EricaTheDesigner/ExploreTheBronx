package com.example.android.explorethebronx;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    /**Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     *
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in
     * @param locations is the list of {@link Location}s to be displayed
     * @param colorResourceId is the resource ID for the background color for this list of words
     */

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId){
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the {@Link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        //Get the Textview in the list_item.xml layout with the ID location_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);

        //Get the Location Name from the currentWord object and set this text on the Location TextView.
        locationTextView.setText(currentLocation.getLocationName());

        //Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        //Get the default translation from the currentWord object and set this text on the default TextView.
        defaultTextView.setText(currentLocation.getLocationDescription());

        //Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //Check if an image is provided for this word or not
        if (currentLocation.hasImage()){
            //If an image is available, display the provided image bases on the resource ID
            imageView.setImageResource(currentLocation.getImageResourceId());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout (containing 2 TextViews) so that is can be shown in
        // the ListView.
        return listItemView;
    }
}
