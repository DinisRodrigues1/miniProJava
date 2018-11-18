package com.example.pantaleao.miniprojava;

public class Retangulo{
    float w, h;
    int x, y;

    public Retangulo(float width, float height, int x, int y) {
        this.w = width;
        this.h = height;
        this.x = x;
        this.y = y;
    }

    public float calcPerimetro(Retangulo a) {
        return (a.w * 2) + (a.h *2);
    }

    public float calcArea(Retangulo a) {
        return a.w * a.h;
    }
}
