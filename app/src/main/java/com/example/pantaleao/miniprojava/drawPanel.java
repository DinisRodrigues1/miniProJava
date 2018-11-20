package com.example.pantaleao.miniprojava;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;


public class drawPanel extends View {
    Paint paint = null;
    int figure;
    Intent intent;



    public drawPanel(Context context) {
        super(context);
        paint = new Paint();
        figure = 0;

    }

    public drawPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        figure = 0;
    }


    public drawPanel(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();
        figure = 0;

    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);

        if (figure == 1) {
            // TODO RETA
        }
        else if (figure == 2) {
            // TODO CIRCULO
            Context context = getContext();
            /*Bundle extras = intent.getExtras();
            double origX = extras.getDouble("origX");
            double origY = extras.getDouble("origY");
            double radius = extras.getDouble("radius");*/
            Toast.makeText(context, "Something" + (int) MainActivity.origX, Toast.LENGTH_SHORT).show();
            paint.setColor(Color.parseColor("#000000"));
            canvas.drawCircle((float)MainActivity.origX, (float)MainActivity.origY, (float)MainActivity.radius, paint);
        }
        else if (figure == 3) {
            // TODO POLI
        }
        else {
            // TODO por favor escolha uma figura;
        }


        }

    public void setfigure(int a) {
        this.figure = a;

    }


    }


