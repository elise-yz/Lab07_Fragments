package com.zhuelise.lab07fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void removeFragment1(View view) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FragmentManager fm = getSupportFragmentManager();
        Fragment1 fragment = (Fragment1) fm.findFragmentByTag("10101");
        ft.remove(fragment);
        ft.add(R.id.fragment_placeholder, new Fragment2(), "20202");
        ft.commit();
    }

    public void showFragment1(View view) {
        //begin the fragment transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //replace placeholder with fragment
        ft.replace(R.id.fragment_placeholder, new Fragment1(), "10101");
        //save changes
        ft.commit();
    }

    public void hideFragment3(View view) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FragmentManager fm = getSupportFragmentManager();
        Fragment3 fragment3 = (Fragment3) fm.findFragmentByTag("30303");
        ft.hide(fragment3);
        ft.commit();
    }

    public void addFragment3(View view) {
        //begin the fragment transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //replace placeholder with fragment
        ft.replace(R.id.fragment_placeholder, new Fragment4(), "40404");
        ft.add(R.id.fragment_placeholder, new Fragment3(), "30303");
        //save changes
        ft.commit();
    }

    public void showFragment3(View view) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FragmentManager fm = getSupportFragmentManager();
        Fragment3 fragment3 = (Fragment3) fm.findFragmentByTag("30303");
        ft.show(fragment3);
        ft.commit();
    }

    public void showFragment5(View view) {
        count++;
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_placeholder, Fragment5.newInstanceOf(count), "50505");
        ft.commit();
    }
}