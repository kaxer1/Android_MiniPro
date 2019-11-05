package com.example.android_minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class veinteYtres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veinte_ytres);
    }

    public void presionGato(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.gato);
        mp.start();
    }

    public void presionLeon(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.leon);
        mp.start();
    }
}
