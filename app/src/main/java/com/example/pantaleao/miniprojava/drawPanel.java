package com.example.pantaleao.miniprojava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;



public class drawPanel extends View {
    Paint paint = null;
    TextView s;


    public drawPanel(Context context) {
        super(context);
        paint = new Paint();

    }

    public drawPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }


    public drawPanel(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x = getWidth();
        int y = getHeight();
        int radius;
        radius = 100;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);

        // Use Color.parseColor to define HTML colors
        paint.setColor(Color.parseColor("#CD5C5C"));


        //int color = MainActivity.colorVal;

        /*Ponto2D p1 = new Ponto2D(MainActivity.selX, MainActivity.selY);
        if (MainActivity.colorVal.equals(String.valueOf(android.R.color.black))) {
            paint.setColor(Color.parseColor(MainActivity.colorVal));
        }*/

      /*  if (MainActivity.colorVal.equals(String.valueOf(android.R.color.white))) {
            paint.setColor(Color.parseColor(MainActivity.colorVal));
            canvas.drawColor(Color.WHITE);
        } */



        }

    }


