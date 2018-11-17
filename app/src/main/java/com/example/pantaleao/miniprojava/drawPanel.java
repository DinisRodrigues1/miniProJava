package com.example.pantaleao.miniprojava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;


public class drawPanel extends View {
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
        if (figure ==1) // fazer resto de casos if para mudança de cores
            canvas.drawCircle(x / 2, y / 2, radius, paint);
    }


    public void setfigure(int a){
        this.figure=a;
    }
}

