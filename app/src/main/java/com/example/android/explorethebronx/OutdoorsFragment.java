package com.example.android.explorethebronx;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OutdoorsFragment extends Fragment {

        public OutdoorsFragment() {
            // Required empty public constructord
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.location_list, container, false);

            // Create a list of words
            final ArrayList<Location> locations = new ArrayList<Location>();
            locations.add(new Location("Wave Hill Public Gardens", "28-acre estate overlooking the Hudson. ", R.drawable.wavehill));
            locations.add(new Location("New York Botanical Garden", "250-acre site that supports over one million living plants.", R.drawable.botanicalgarden));
            locations.add(new Location("High Bridge", "NYC's oldest bridge, reopened in 2015 as a pedestrian walkway.", R.drawable.highbridge));
            locations.add(new Location("Bronx River", "Enjoy free canoeing at New York's only freshwater river.", R.drawable.bronxriver));
            locations.add(new Location("Pelham Bay Park", "Comprised on 2,772 acres, this is the largest park in NYC.", R.drawable.pelham));
            locations.add(new Location("The Bronx Zoo", "The largest metropolitan zoo in the United States.", R.drawable.bronxzoo));
            locations.add(new Location("Woodlawn Cemetery", "Home to icons such as Miles Davis, Herman Melville, and Fiorello La Guardia.", R.drawable.woodlawncemetery));

            // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
            // adapter knows how to create list items for each item in the list.
            LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_outdoors);

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
