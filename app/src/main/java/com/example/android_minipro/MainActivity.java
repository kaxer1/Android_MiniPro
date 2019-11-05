package com.example.android_minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtUsu;
    private EditText txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsu = (EditText)findViewById(R.id.txtUsuario);
        txtPass = (EditText) findViewById(R.id.txtPassword);
    }

    public void login(View v){

        if(txtUsu.getText().toString().equals("Admin") && txtPass.getText().toString().equals("admin")){

            Intent ok = new Intent(this,ejercicios.class);
            startActivity(ok);

        }else{

            Intent error = new Intent(this,error.class);
            startActivity(error);

        }
    }
}
