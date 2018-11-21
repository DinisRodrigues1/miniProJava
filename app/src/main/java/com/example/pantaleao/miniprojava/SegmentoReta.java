package com.example.pantaleao.miniprojava;

public class SegmentoReta {
    private String color;
    private Ponto2D a;
    private Ponto2D b;
    private boolean zeroPoints = true;

    public SegmentoReta(){

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


}