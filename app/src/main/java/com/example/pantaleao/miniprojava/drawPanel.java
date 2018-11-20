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
    String color = MainActivity.colorVal;



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
       // paint.setColor(Color.parseColor("#000000"));

        //paint.setColor(Color.parseColor("#CB5CB5"));
        //canvas.drawCircle(x/2, y/2, radius, paint);
        //String color = MainActivity.colorVal;

        if (color.equals("#000000")) {
            paint.setColor(Color.parseColor("#000000"));
            canvas.drawCircle(x/2, y/5, radius, paint);
        }
        /*else if (color.equals(String.valueOf(android.R.color.white))) {
            paint.setColor(Color.WHITE);
        } */
        else if (color.equals("#FF0000")) {
            paint.setColor(Color.parseColor("#FF0000"));
            canvas.drawCircle(x/2, y/2, radius, paint);
        }
        else if (color.equals("#008000")) {
            paint.setColor(Color.parseColor("#008000"));
            canvas.drawCircle(x/2, y/4, radius, paint);
        }
        else if (color.equals("#0000FF")){
            paint.setColor(Color.parseColor("#0000FF"));
            canvas.drawCircle(x/3, y/3, radius, paint);
        }

      /*  if (MainActivity.colorVal.equals(String.valueOf(android.R.color.white))) {
            paint.setColor(Color.parseColor(MainActivity.colorVal));
            canvas.drawColor(Color.WHITE);
        } */



        }

    }


