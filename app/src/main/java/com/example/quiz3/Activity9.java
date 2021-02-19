package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class Activity9 extends AppCompatActivity {

    PDFView pdfView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_9 );

        pdfView2 = findViewById( R.id.pdfView2 );

        pdfView2.fromAsset(  "DECEMBER2020.pdf").load();




    }

}
