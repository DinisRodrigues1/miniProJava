package com.example.pantaleao.miniprojava;

import java.util.Vector;

public class Poligono {

  private Vector<Ponto2D> lista;

    public Poligono(Ponto2D ponto) {
        lista = new Vector();
        lista.add(ponto);

    }
    public Poligono() {
        lista = new Vector();
    }

    public void add(Ponto2D aux)
    {
        lista.add(aux);
    }

    public Vector<Ponto2D> getLista() {
        return lista;
    }
}
