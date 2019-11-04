package com.example.android_minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ejercicio15 extends AppCompatActivity {

    private EditText et_nombre,et_contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio15);
        et_nombre=(EditText)findViewById(R.id.etex1);
        et_contenido=(EditText)findViewById(R.id.et2);
    }

    public void btnGrabar(View view){
        String nomarchivo = et_nombre.getText().toString();
        String contenido = et_contenido.getText().toString();

        try {
            File tarjetaSD = Environment.getExternalStorageDirectory();
            Toast.makeText(this,tarjetaSD.getPath(),Toast.LENGTH_LONG).show();
            File rutaFile = new File(tarjetaSD.getPath(), nomarchivo);
            OutputStreamWriter osw = new OutputStreamWriter(openFileOutput(nomarchivo, Activity.MODE_PRIVATE));
            osw.write(contenido);
            osw.flush();
            osw.close();
            Toast.makeText(this, "Grabado correctamente", Toast.LENGTH_SHORT).show();
            et_nombre.setText("");
            et_contenido.setText("");
        } catch (IOException ioe) {
            Toast.makeText(this, "No se pudo grabar",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void btnRecuperar(View view){
        String nomarchivo = et_nombre.getText().toString();

        try {
            File tarjeta = Environment.getExternalStorageDirectory();
            File file = new File(tarjeta.getPath(), nomarchivo);
            InputStreamReader abrirArchivo = new InputStreamReader(openFileInput(nomarchivo));

            BufferedReader leerArchivo = new BufferedReader(abrirArchivo);
            String linea = leerArchivo.readLine();
            String contenidoCompleto = "";
            while (linea != null) {
                contenidoCompleto = contenidoCompleto + linea + "\n";
                linea = leerArchivo.readLine();
            }
            leerArchivo.close();
            abrirArchivo.close();
            et_contenido.setText(contenidoCompleto);

        } catch (IOException e) {
            Toast.makeText(this, "No se pudo leer", Toast.LENGTH_SHORT).show();
        }
    }

    public void cerrarActiviy(View view){
        finish();
    }
}
