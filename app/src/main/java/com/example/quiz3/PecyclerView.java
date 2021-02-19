package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.ArrayList;

public class PecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AdapterRecycler adapterRecycler;
    ArrayList<PojoLinear> pojoLinears;
    public static final int REQUEST_PERMISSION = 1;
    File folder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pecycler_view );

        //permission





        linearList();

        recyclerView = findViewById(R.id.recyclerview_linear);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterRecycler =  new AdapterRecycler(this, pojoLinears);
        recyclerView.setAdapter( adapterRecycler );
    }




    private void linearList() {
        pojoLinears = new ArrayList<PojoLinear>();
        pojoLinears.add(new PojoLinear(R.drawable.gkbook, "Current Affairs January 2021"));
        pojoLinears.add(new PojoLinear(R.drawable.gkbook, "Current Affairs February 2021"));
        pojoLinears.add(new PojoLinear(R.drawable.gkbook, "Current Affairs December 2020"));


    }
}




