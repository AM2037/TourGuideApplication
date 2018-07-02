package com.example.android.tourguideapplication;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

@SuppressWarnings("ALL")
public class CategoryAdapter extends FragmentPagerAdapter {

    private static final int PAGE_COUNT = 4;
    private final Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1){
            return new ParksFragment();
        } else if (position == 2){
            return new EventsFragment();
        } else {
            return new AttractionsFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    public String getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return context.getString(R.string.category_parks);
        } else if (position == 2)  {
            return context.getString(R.string.category_events);
        } else {
            return context.getString(R.string.category_attractions);
        }
    }
}
