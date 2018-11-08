package com.example.pantaleao.miniprojava;

public class Poligono {
    int xpoints;
    int npoints;

    public Poligono (int x, int n){
        this.xpoints = x;
        this.npoints = n;
    }

    public double calcPerimetro(Poligono a) {
        return a.xpoints * a.npoints;
    }
    public double calcArea(Poligono a) {
        return (a.npoints * (a.xpoints * a.xpoints)) / (4.0 * Math.tan((Math.PI / a.npoints)));

    }
