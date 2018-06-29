package com.example.android.tourguideapplication;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

//PlaceAdapter extends or inherits behavior from the ArrayAdapter class

class PlaceAdapter extends ArrayAdapter<Place> {

    // Resource ID for the background color for each list of places
    private final int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *  @param context        The current context. Used to inflate the layout file.
     * @param places A List of Place objects to display in a list*/
    PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent,false);
        }

        // Get the {@link Place} object located at this position on the list
        Place currentPlace = getItem(position);

        //Find TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        //Get name from current Place object and set this text on name TextView
        assert currentPlace != null;
        nameTextView.setText(currentPlace.getPlaceName());

        //Find TextView in list_item.xml layout with the ID address_text_view
        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        //Get miwok translation from current Word object and set this text on miwok TextView
        addressTextView.setText(currentPlace.getPlaceAddress());

        //Find ImageView in list_item.xml layout with ID list_icon
        ImageView imageView = listItemView.findViewById(R.id.image);

        if(currentPlace.hasImage()) {
            //Set the ImageView to the image resource specified in the current Place
            imageView.setImageResource(currentPlace.getImageResourceId());

            //Make sure the view is visible since views get reused
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //Set color theme for list items
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Find color that resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}