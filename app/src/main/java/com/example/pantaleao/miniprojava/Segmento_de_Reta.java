package com.example.pantaleao.miniprojava;

public class Segmento_de_Reta {
    String color;
    Ponto2D a;
    Ponto2D b;
    double dist;


    public Segmento_de_Reta(String c, Ponto2D a, Ponto2D b) {
        color = c;
        this.a = a;
        this.b = b;
        dist =  a.distPontos(b);
    }

    public double pontoMedio(Ponto2D a, Ponto2D b) {
        return (a.x + b.x) + (a.y + b.y) / 2;
    }

}