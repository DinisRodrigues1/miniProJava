package com.example.pantaleao.miniprojava;

public class Ponto2D {
    double x;
    double y;
    private boolean zeroPoints = true;

    public Ponto2D(){

    }

    public  Ponto2D(double coordX, double coordY) {
        this.x = coordX;
        this.y = coordY;
    }

    public double distPontos (Ponto2D a) {
        return Math.sqrt(Math.pow((a.x - this.x), 2) + Math.pow((a.y - this.y), 2));
    }


}
