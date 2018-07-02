package com.example.android.tourguideapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the viewpager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        //create an adapter that knows which fragment will show on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);
        assert viewPager != null;
        viewPager.setAdapter(adapter);

        //Give the tab layout the viewpager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        assert tabLayout != null;
        tabLayout.setupWithViewPager(viewPager);

    }
}
