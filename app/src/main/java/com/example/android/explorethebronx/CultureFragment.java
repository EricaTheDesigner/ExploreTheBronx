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
public class CultureFragment extends Fragment {

        public CultureFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.location_list, container, false);

            // Create a list of words
            final ArrayList<Location> locations = new ArrayList<Location>();
            locations.add(new Location("Bronx Museum of the Arts", "Free admission at this hidden gem", R.drawable.bronxmuseumsmall));
            locations.add(new Location("The Edgar Allan Poe Cottage", "The former home of American writer Edgar Allan Poe.", R.drawable.eaphouse));
            locations.add(new Location("Bartow-Pell Mansion Museum ", "Built between 1836 and 1842, opened as a museum in 1946", R.drawable.bartowpell));
            locations.add(new Location("BronxArtSpace", "Non-profit gallery that promotes underrepresented and emerging artists and curators ", R.drawable.bronxartspace));
            locations.add(new Location("Bronx Documentary Center", "Free guided tours and home to the Bronx Photo League.", R.drawable.documentarycenter));
            locations.add(new Location("WallWorks Gallery", "A contemporary gallery dedicated to bringing art back uptown.", R.drawable.wallworks));
            locations.add(new Location("Yankee Stadium", "The home ballpark of the New York Yankees.", R.drawable.yankee));

            // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
            // adapter knows how to create list items for each item in the list.
            LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_culture);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml file.
            ListView listView = (ListView) rootView.findViewById(R.id.list);

            // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Location} in the list.
            listView.setAdapter(adapter);

            return rootView;
        }
    }