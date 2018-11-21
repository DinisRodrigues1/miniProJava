package com.example.pantaleao.miniprojava;

public class SegmentoReta {
    private String color;
    private Ponto2D a;
    private Ponto2D b;
    private double dist;
    private boolean zeroPoints = true;

    public SegmentoReta(){

    }

    public SegmentoReta(String c, Ponto2D a, Ponto2D b) {
        color = c;
        this.a = a;
        this.b = b;
        dist = a.distPontos(b);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ponto2D getA() {
        return a;
    }

    public void setA(Ponto2D a) {
        this.zeroPoints = false;
        this.a = a;
    }

    public Ponto2D getB() {
        return b;
    }

    public void setB(Ponto2D b) {
        this.b = b;
        this.zeroPoints=true;
    }

    public boolean isZeroPoints() {
        return zeroPoints;
    }

    public void setZeroPoints(boolean zeroPoints) {
        this.zeroPoints = zeroPoints;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public double pontoMedio(Ponto2D a, Ponto2D b) {
        return (a.getX() + b.getX()) + (a.getY()+ b.getY()) / 2;
    }
}