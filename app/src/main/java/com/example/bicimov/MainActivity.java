package com.example.bicimov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegister(View view) {
        Intent i = new Intent(MainActivity.this, RegistrerActivity.class);
        startActivity(i);

    }

    public void onClickIniciar(View view) {
        Intent i = new Intent(MainActivity.this, NavigationActivity.class);
        startActivity(i);
    }
}