package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class Activity8 extends AppCompatActivity {

    PDFView pdfView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_8 );

        pdfView1 = findViewById( R.id.pdfView1 );

        pdfView1.fromAsset(  "JANUARY2021.pdf").load();




    }

}
