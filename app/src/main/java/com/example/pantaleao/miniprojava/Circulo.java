package com.example.pantaleao.miniprojava;

public class Circulo {
    private Ponto2D pointOne;
    private Ponto2D pointTwo;
    private Ponto2D center = null;
    private double raio;
    private boolean zeroPoints = true;

    public Circulo(){

    }

    public Ponto2D getCenter() {
        return center;
    }

    public void setCenter(Ponto2D center) {
        this.center = center;
    }

    public double getRaio() {
        return raio;
    }

    public boolean isZeroPoints() {
        return zeroPoints;
    }

    public void setPointOne(Ponto2D pointOne) {
        this.pointOne = pointOne;
        this.zeroPoints = false;
    }

    public void setPointTwo(Ponto2D pointTwo) {
        this.pointTwo = pointTwo;
    }

    public void calc(){
        this.zeroPoints=true;
        this.raio = Math.sqrt(Math.pow((this.pointOne.getX() - this.pointTwo.getX()), 2) + Math.pow((this.pointOne.getY() - this.pointTwo.getY()), 2));
        this.center = new Ponto2D((this.pointTwo.getX() + this.pointOne.getX())/2,(pointTwo.getY() + this.pointOne.getY())/2);
    }
}

