package com.example.pantaleao.miniprojava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class drawPanel extends View {
    Paint paint = null;
    TextView s;
    //String color = MainActivity.colorVal;



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


        }

    }


