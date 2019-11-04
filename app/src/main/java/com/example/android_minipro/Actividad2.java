package com.example.android_minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.File;

public class Actividad2 extends AppCompatActivity {

    private ListView lv1;
    private ImageView iv1;
    private String[] archivos;
    private ArrayAdapter<String> adaptador1;

    String direccionMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        File dir=getExternalFilesDir(Environment.DIRECTORY_PICTURES);

        direccionMostrar = dir.getAbsolutePath();
        archivos=dir.list();
        adaptador1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,archivos);
        lv1=(ListView)findViewById(R.id.listView1);
        lv1.setAdapter(adaptador1);

        iv1=(ImageView)findViewById(R.id.imageView1);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Bitmap bitmap1 = BitmapFactory.decodeFile(direccionMostrar+"/"+archivos[arg2]);
                iv1.setImageBitmap(bitmap1);
            }});
    }
}
