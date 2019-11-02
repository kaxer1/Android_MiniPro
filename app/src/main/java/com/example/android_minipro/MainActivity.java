package com.example.android_minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quince(View view){
        Intent ok = new Intent(this,ejercicio15.class);
        startActivity(ok);
    }

    public void VenteYSeis(View view){
        Intent ok = new Intent(this,venteYseis.class);
        startActivity(ok);
    }
}
