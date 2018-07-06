package com.example.android.tourguideapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants in Houston.
 */
@SuppressWarnings("ALL")

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurants_1), getString(R.string.restaurants_address_1), R.drawable.bcn));
        places.add(new Place(getString(R.string.restaurants_2), getString(R.string.restaurants_address_2), R.drawable.etoile));
        places.add(new Place(getString(R.string.restaurants_3), getString(R.string.restaurants_address_3), R.drawable.katarobata2));
        places.add(new Place(getString(R.string.restaurants_4), getString(R.string.restaurants_address_4), R.drawable.kirans2));
        places.add(new Place(getString(R.string.restaurants_5), getString(R.string.restaurants_address_5), R.drawable.malasichaun));
        places.add(new Place(getString(R.string.restaurants_6), getString(R.string.restaurants_address_6), R.drawable.pelipeli2));
        places.add(new Place(getString(R.string.restaurants_7), getString(R.string.restaurants_address_7), R.drawable.genghisgrill));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter((ListAdapter) adapter);
        return rootView;
    }

}

