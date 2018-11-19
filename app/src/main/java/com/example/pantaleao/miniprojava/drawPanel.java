package com.example.pantaleao.miniprojava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;



public class drawPanel extends View {
    static int contador = 1;
    Paint paint = null;
    int figure;
    TextView s;


    public drawPanel(Context context) {
        super(context);
        paint = new Paint();
        figure=0;


    }

    public drawPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        figure =0;
    }


    public drawPanel(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();
        figure =0;
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

        if (figure ==1)
            canvas.drawCircle(x / 2, y / 2, radius, paint);

       String color = MainActivity.colorVal;
       if (contador % 2 != 0) {
           double xx = MainActivity.selX;
           double yy = MainActivity.selY;
           Ponto2D p1 = new Ponto2D(xx, yy);
           contador++;
       }
       else if (contador % 2 == 0){
           double xx = MainActivity.selX;
           double yy = MainActivity.selY;
           Ponto2D p2 = new Ponto2D(xx, yy);
           contador--;
       }




    }



    public void setfigure(int a){
        this.figure=a;
    }
   /* @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                break;
            case MotionEvent.ACTION_UP:
                v.performClick();
                break;
            default:
                break;
        }
        return true;
    }*/
}

