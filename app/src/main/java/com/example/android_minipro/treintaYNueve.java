package com.example.android_minipro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class treintaYNueve extends AppCompatActivity {

    private int corx, cory;
    private Lienzo fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinta_ynueve);

        corx = 100;
        cory = 100;
        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        fondo = new Lienzo(this);
        fondo.setOnTouchListener((View.OnTouchListener) this);
        layout1.addView(fondo);
    }

    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        public boolean onTouch(View v, MotionEvent event) {
            corx = (int) event.getX();
            cory = (int) event.getY();
            fondo.invalidate();
            return true;
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawRGB(255, 255, 0);
            Paint pincel1 = new Paint();
            pincel1.setARGB(255, 255, 0, 0);
            pincel1.setStrokeWidth(4);
            pincel1.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(corx, cory, 20, pincel1);
        }
    }

    public void cerrarActiviy(View view){
        finish();
    }
}
