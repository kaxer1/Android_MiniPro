package com.example.android_minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

public class venteYseis extends AppCompatActivity implements MediaPlayer.OnPreparedListener{

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vente_yseis);
    }


    public void ejecutar(View v) {
        mp = new MediaPlayer();
        mp.setOnPreparedListener(this);
        try {
            mp.setDataSource("http://www.javaya.com.ar/recursos/gato.mp3");
            mp.prepareAsync();
        } catch (IOException e) {
        }
        Toast t = Toast.makeText(this, "Espere un momento mientras se carga el mp3", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mp.start();
    }
}
