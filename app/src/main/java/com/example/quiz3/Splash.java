package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.os.Bundle;

public class Splash extends AppCompatActivity {

    Handler h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );


        h = new Handler();
        h.postDelayed( new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(Splash.this, AfterSplash.class );
                startActivity( i );
                finish();

            }
        }, 3000 );


    }
}

