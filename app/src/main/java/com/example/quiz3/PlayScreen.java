package com.example.quiz3;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class PlayScreen extends AppCompatActivity implements View.OnClickListener {

    Button btPlayQuiz,btSettings;

    public static Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_play_screen );


        btPlayQuiz = findViewById( R.id.bt_playQuiz );
        btSettings = findViewById( R.id.bt_settings );

        btSettings.setOnClickListener( this );
        btPlayQuiz.setOnClickListener( this );


          context = getApplicationContext();
          AppController.currentActivity = this;
          if (SettingsPreferences.getMusicEnableDisable( context )){
              try{

                  AppController.playMusic();

              }catch (IllegalStateException e){
                  e.printStackTrace();
              }
          }

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.bt_playQuiz:

                Intent playIntent = new Intent( PlayScreen.this,QuizActivity.class );
                startActivity(playIntent);

              break;

            case R.id.bt_settings:

                Intent settingIntent = new Intent(PlayScreen.this,Settings.class);
                 startActivity(settingIntent);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AppController.StopSound();
        finish();

    }



}
