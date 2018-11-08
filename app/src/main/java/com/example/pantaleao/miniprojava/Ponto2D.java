package com.example.pantaleao.miniprojava;

public class Ponto2D {
    double x;
    double y;


    public Ponto2D(double coordX, double coordY) {
        this.x = coordX;
        this.y = coordY;
    }

    public Ponto2D(Ponto2D a) {
        double result = Math.sqrt(Math.pow((this.x - a.x), 2) + Math.pow((this.y - a.y), 2));
    }

    public Ponto2D() {
        x = 0;
        y = 0;
    }

    public double distPontos (Ponto2D a) {
        return Math.sqrt(Math.pow((a.x - this.x), 2) + Math.pow((a.y - this.y), 2));
    }


}
