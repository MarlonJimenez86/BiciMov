package com.example.bicimov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ReglamentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglament);
    }

    public void onClickRegister(View view) {
        Intent i = new Intent(ReglamentActivity.this, NavigationActivity.class);
        startActivity(i);


    }
}
