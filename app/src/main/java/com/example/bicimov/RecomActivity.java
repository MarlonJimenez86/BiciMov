package com.example.bicimov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RecomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recom);

    }

    public void onClickRecomend(View view) {
        //Para navegra se realiza lo siguiente esoo mrk
        //Intent i = new Intent(Aqui donde se encuentra, Aqui para donde va
        // );
        Intent i = new Intent(RecomActivity.this, NavigationActivity.class);
        startActivity(i);

    }
}