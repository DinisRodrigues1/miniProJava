package com.example.pantaleao.miniprojava;

public class Circulo {
    float r;
    float centerX;
    float centerY;

    public Circulo(float radius, float x, float y) {
        this.centerX = x;
        this.centerY = y;
        this.r = radius;
    }

    public float perimeter(Circulo a) {
        return (float) (2 * Math.PI * a.r);
    }
}

