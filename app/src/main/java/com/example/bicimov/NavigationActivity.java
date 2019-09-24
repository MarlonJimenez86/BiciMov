package com.example.bicimov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
    }

    public void onClickReglament(View view) {

        Intent i = new Intent(NavigationActivity.this, ReglamentActivity.class);
        startActivity(i);


    }

    public void onClickRuta(View view) {

        Intent i = new Intent(NavigationActivity.this, RecomActivity.class);
        startActivity(i);


    }

    public void onClickRegister(View view) {

        Intent i = new Intent(NavigationActivity.this, RegistAccidActivity.class);
        startActivity(i);


    }

    public void onClickPublic(View view) {

        Intent i = new Intent(NavigationActivity.this, PublicActivity.class);
        startActivity(i);


    }

    public void onClickPhoneCall(View view) {

        Intent i = new Intent(NavigationActivity.this, TallmovActivity.class);
        startActivity(i);


    }
}
