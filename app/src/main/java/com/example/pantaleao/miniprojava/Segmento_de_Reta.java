package com.example.pantaleao.miniprojava;

public class Segmento_de_Reta extends Ponto2D{
    int color;
    Ponto2D a;
    Ponto2D b;


    public Segmento_de_Reta(int c) {
        color = c;
    }

    public double pontoMedio(Ponto2D a, Ponto2D b) {
        return (a.x + b.x) + (a.y + b.y) / 2;
    }



   /* public double changeColor(int c) {
        return
    }*/
}