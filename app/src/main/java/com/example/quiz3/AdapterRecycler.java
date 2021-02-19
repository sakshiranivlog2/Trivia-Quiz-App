package com.example.quiz3;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.MyHolder> {
    private Context context;
    private ArrayList<PojoLinear> pojoLinears;


    AdapterRecycler(Context context, ArrayList<PojoLinear> pojoLinears){
        this.context = context;
        this.pojoLinears = pojoLinears;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.custom_list, parent,false );
        return new MyHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int position) {
        myHolder.codeName.setText(pojoLinears.get(position).getCodeName());
        myHolder.image.setImageResource(pojoLinears.get(position).getImages());
        myHolder.custom_list.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Activity7.class);
                if(position==0){
                    intent = new Intent(context,Activity7.class);
                }else if(position==1) {
                    intent = new Intent( context, Activity8.class );}
                 else if(position==2) {
                        intent = new Intent( context, Activity9.class );
                }

                //now sending position of item in recyclerview
                intent.putExtra("position", position);
                context.startActivity( intent );





            }
        } );

    }


    @Override
    public int getItemCount() {
        return pojoLinears.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView codeName;
        ImageView image;
        RelativeLayout custom_list;


        MyHolder(@NonNull View itemView) {
            super( itemView );
            codeName = itemView.findViewById(R.id.code_name);
            image = itemView.findViewById(R.id.Img1);
            custom_list = itemView.findViewById( R.id.custom_list );
            itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hii();
                }

                private void hii() {
                    Intent i = new Intent( context, Activity7.class );
                    context.startActivity(i);
                }
            } );

        }


    }
}
