package com.zhuelise.lab07fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //begin the fragment transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //replace placeholder with fragment
        ft.add(R.id.fragment_placeholder, new Fragment1());
        //save changes
        ft.commit();
    }
}