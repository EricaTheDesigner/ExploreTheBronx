package com.example.android.explorethebronx;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.explorethebronx.LocationAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.food_location_1), getString(R.string.food_descrip_1), R.drawable.cityisland));
        locations.add(new Location(getString(R.string.food_location_2), getString(R.string.food_descrip_2), R.drawable.arthurave));
        locations.add(new Location(getString(R.string.food_location_3), getString(R.string.food_descrip_3), R.drawable.cuchifrito));
        locations.add(new Location(getString(R.string.food_location_4), getString(R.string.food_descrip_4), R.drawable.fishnting));
        locations.add(new Location(getString(R.string.food_location_5), getString(R.string.food_descrip_5), R.drawable.bognan));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}