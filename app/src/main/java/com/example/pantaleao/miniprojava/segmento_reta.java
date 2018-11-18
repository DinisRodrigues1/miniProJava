package com.example.pantaleao.miniprojava;

public class segmento_reta {
    String color;
    Ponto2D a;
    Ponto2D b;
    double dist;


    public segmento_reta(String c, Ponto2D a, Ponto2D b) {
        color = c;
        this.a = a;
        this.b = b;
        dist =  a.distPontos(b);
    }

    public double pontoMedio(Ponto2D a, Ponto2D b) {
        return (a.x + b.x) + (a.y + b.y) / 2;
    }


}