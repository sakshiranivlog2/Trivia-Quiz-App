package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterSplash extends AppCompatActivity {

    Button learn,test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_after_splash );

        learn = findViewById( R.id.learn );
        test = findViewById( R.id.test );

        learn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oo();
            }

            private void oo() {
                Intent i = new Intent( AfterSplash.this, PecyclerView.class );
                startActivity( i );
            }
        } );

        test.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op();
            }

            private void op() {
                Intent i = new Intent( AfterSplash.this,PlayScreen.class );
                startActivity( i );
            }
        } );

    }
}
