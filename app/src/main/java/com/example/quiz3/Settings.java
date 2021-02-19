package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import  static com.example.quiz3.AppController.StopSound;


public class Settings extends AppCompatActivity {

    private Context mContext;
    private Switch mMusicCheckBox;
    private Button ok_btn;
    private boolean isMusicOn;
    public static MediaPlayer player;
    public static Activity currentActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_settings );

        mContext = Settings.this;
        AppController.currentActivity = this;

        initViews();
        populateMusicEnableContents();


    }

    private void initViews() {
        mMusicCheckBox = findViewById( R.id.music_checkbox );
        mMusicCheckBox.setChecked( true );
        ok_btn = findViewById( R.id.bt_settings );

        ok_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlayScreen();
            }
        } );


    }

    private void goToPlayScreen() {

        Intent intentPlayScreen = new Intent( Settings.this, PlayScreen.class );
        startActivity( intentPlayScreen );

    }

    public void viewClickHandler(View view) {

        switch (view.getId()) {

            case R.id.music_checkbox:
                switchMusicEnableCheckbox();
                break;
        }


    }

    private void switchMusicEnableCheckbox() {
        isMusicOn = !isMusicOn;
        if (isMusicOn) {
            SettingsPreferences.setMusicEnableDisable( mContext, true );
            AppController.playMusic();
        } else {
            SettingsPreferences.setMusicEnableDisable( mContext, false );
            AppController.StopSound();
        }

        populateMusicEnableContents();


    }


    protected void populateMusicEnableContents() {
        if (SettingsPreferences.getMusicEnableDisable( mContext )) {
            AppController.playMusic();
            mMusicCheckBox.setChecked( true );
        } else {
            StopSound();
            mMusicCheckBox.setChecked( false );
        }
        isMusicOn = SettingsPreferences.getMusicEnableDisable( mContext );

    }


    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

}