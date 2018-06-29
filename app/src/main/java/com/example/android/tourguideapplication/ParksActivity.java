package com.example.android.tourguideapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.text_container, new ParksFragment())
                .commit();
    }
}