package com.developer.happypaws4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class View_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        getSupportActionBar().hide();
    }
}