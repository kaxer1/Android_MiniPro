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

        // http://wvw.simp3s.net/descargar-mp3/escuchar DE ESA PAGINA PODRAS DESCARGAR LOS ARCHIVOS
        try {
            mp.setDataSource("https://www.yt2mp3s.me/@download/251-5dbe36cd7102b-2280000-285-64-webm-4272205/mp3/LtMQDPAnauE/Victor%2BK%25C3%25BCppers%253A%2BPor%2Bqu%25C3%25A9%2Bes%2Btan%2Bimportante%2Baprender%2Ba%2Bescuchar.mp3");
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
