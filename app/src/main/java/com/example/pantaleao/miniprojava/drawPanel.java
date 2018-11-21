package com.example.pantaleao.miniprojava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class drawPanel extends View {
    Paint paint;
    Paint figurePaint;
    int figure;
    String colorCode;

    // variaveis do circulo
    Ponto2D centro;
    double raio;

    //variaveis linha
    Ponto2D linhaPonto1;
    Ponto2D linhaPonto2;

    //Variaveis poligno
    Ponto2D poligPonto1;
    Ponto2D poligPonto2;
    Ponto2D poligPonto3;
    Ponto2D poligPonto4;
    Ponto2D poligPonto5;

    public drawPanel(Context context) {
        super(context);
        paint = new Paint();
        figure = 0;
        colorCode = "#FFFFFF";
    }

    public drawPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        figure = 0;
        colorCode = "#FFFFFF";
    }


    public drawPanel(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();
        figure = 0;
        colorCode = "#FFFFFF";
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        figurePaint = new Paint();

        figurePaint.setStrokeWidth(5);

        if (figure == 1) {
            if(linhaPonto1 != null && linhaPonto2 != null){
                figurePaint.setColor(Color.parseColor(colorCode));
                canvas.drawLine((float)linhaPonto1.getX(), (float)linhaPonto1.getY(), (float)linhaPonto2.getX(), (float)linhaPonto2.getY(), figurePaint);
            }
        }
        else if (figure == 2) {
            if(centro != null){
                figurePaint.setColor(Color.parseColor(colorCode));
                canvas.drawCircle((float)this.centro.getX(), (float)this.centro.getY(), (float)raio, figurePaint);
            }
        }
        else if (figure == 3) {
            if(poligPonto1 !=null && poligPonto2 !=null && poligPonto3 !=null) {

                float[] points = {
                        (float)poligPonto1.getX(), (float)poligPonto1.getY(), (float)poligPonto2.getX(), (float)poligPonto2.getY(),
                        (float)poligPonto2.getX(), (float)poligPonto2.getY(), (float)poligPonto3.getX(), (float) poligPonto3.getY(),
                        (float)poligPonto3.getX(), (float)poligPonto3.getY(), (float)poligPonto1.getX(), (float) poligPonto1.getY()
                };
                figurePaint.setStyle(Paint.Style.FILL);
                figurePaint.setColor(Color.parseColor(colorCode));
                canvas.drawLines(points, figurePaint);
            }
        } else if (figure == 4) {
            if(poligPonto1 !=null && poligPonto2 !=null && poligPonto3 !=null && poligPonto4 !=null) {

                float[] points = {
                        (float)poligPonto1.getX(), (float)poligPonto1.getY(), (float)poligPonto2.getX(), (float)poligPonto2.getY(),
                        (float)poligPonto2.getX(), (float)poligPonto2.getY(), (float)poligPonto3.getX(), (float) poligPonto3.getY(),
                        (float)poligPonto3.getX(), (float)poligPonto3.getY(), (float)poligPonto4.getX(), (float) poligPonto4.getY(),
                        (float)poligPonto4.getX(), (float)poligPonto4.getY(), (float)poligPonto1.getX(), (float) poligPonto1.getY(),
                };
                figurePaint.setStyle(Paint.Style.FILL);
                figurePaint.setColor(Color.parseColor(colorCode));
                canvas.drawLines(points, figurePaint);
            }
        } else if (figure == 5) {
            if(poligPonto1 !=null && poligPonto2 !=null && poligPonto3 !=null && poligPonto4 !=null && poligPonto5 != null) {

                float[] points = {
                        (float)poligPonto1.getX(), (float)poligPonto1.getY(), (float)poligPonto2.getX(), (float)poligPonto2.getY(),
                        (float)poligPonto2.getX(), (float)poligPonto2.getY(), (float)poligPonto3.getX(), (float) poligPonto3.getY(),
                        (float)poligPonto3.getX(), (float)poligPonto3.getY(), (float)poligPonto4.getX(), (float) poligPonto4.getY(),
                        (float)poligPonto4.getX(), (float)poligPonto4.getY(), (float)poligPonto5.getX(), (float) poligPonto5.getY(),
                        (float)poligPonto5.getX(), (float)poligPonto5.getY(), (float)poligPonto1.getX(), (float) poligPonto1.getY(),
                };
                figurePaint.setStyle(Paint.Style.FILL);
                figurePaint.setColor(Color.parseColor(colorCode));
                canvas.drawLines(points, figurePaint);
            }
        }
        else if (figure == 6) {
            paint.setColor(Color.WHITE);
        }
    }

    public void setfigure(int a, Ponto2D centro, double raio) {
        this.figure = a;
        this.raio = raio;
        this.centro = centro;
    }

    public void setfigure(int a, Ponto2D linhaPonto1, Ponto2D linhaPonto2) {
        this.figure = a;
        this.linhaPonto1 = linhaPonto1;
        this.linhaPonto2 = linhaPonto2;
    }

    public void setfigure(int a, Ponto2D ponto1, Ponto2D ponto2, Ponto2D ponto3) {
        this.figure = a;
        this.poligPonto1 = ponto1;
        this.poligPonto2 = ponto2;
        this.poligPonto3 = ponto3;
    }

    public void setfigure(int a, Ponto2D ponto1, Ponto2D ponto2, Ponto2D ponto3, Ponto2D ponto4) {
        this.figure = a;
        this.poligPonto1 = ponto1;
        this.poligPonto2 = ponto2;
        this.poligPonto3 = ponto3;
        this.poligPonto4 = ponto4;
    }

    public void setfigure(int a, Ponto2D ponto1, Ponto2D ponto2, Ponto2D ponto3, Ponto2D ponto4, Ponto2D ponto5) {
        this.figure = a;
        this.poligPonto1 = ponto1;
        this.poligPonto2 = ponto2;
        this.poligPonto3 = ponto3;
        this.poligPonto4 = ponto4;
        this.poligPonto5 = ponto5;
    }

    public void setcolor(String a) {
        this.colorCode = a;
    }
    public void clearcanvas(int a) {
        this.figure = a;
    }

}


