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
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.location_list, container, false);

            // Create a list of words
            final ArrayList<Location> locations = new ArrayList<>();
            locations.add(new Location(getString(R.string.outdoor_location_1), getString(R.string.outdoor_descrip_1), R.drawable.wavehill));
            locations.add(new Location(getString(R.string.outdoor_location_2), getString(R.string.outdoor_descrip_2), R.drawable.botanicalgarden));
            locations.add(new Location(getString(R.string.outdoor_location_3), getString(R.string.outdoor_descrip_3), R.drawable.highbridge));
            locations.add(new Location(getString(R.string.outdoor_location_4), getString(R.string.outdoor_descrip_4), R.drawable.bronxriver));
            locations.add(new Location(getString(R.string.outdoor_location_5), getString(R.string.outdoor_descrip_5), R.drawable.pelham));
            locations.add(new Location(getString(R.string.outdoor_location_6), getString(R.string.outdoor_descrip_6), R.drawable.bronxzoo));
            locations.add(new Location(getString(R.string.outdoor_location_7), getString(R.string.outdoor_descrip_7), R.drawable.woodlawncemetery));

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
