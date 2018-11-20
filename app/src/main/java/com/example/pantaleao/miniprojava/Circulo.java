package com.example.pantaleao.miniprojava;

public class Circulo {
    private Ponto2D pointOne;
    private Ponto2D pointTwo;
    private boolean zeroPoints = true;

    public Circulo(){

    }


    public boolean isZeroPoints() {
        return zeroPoints;
    }

    public void setZeroPoints(boolean zeroPoints) {
        this.zeroPoints = zeroPoints;
    }

    public Ponto2D getPointOne() {
        return pointOne;
    }

    public void setPointOne(Ponto2D pointOne) {
        this.pointOne = pointOne;
        zeroPoints = false;
    }

    public Ponto2D getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Ponto2D pointTwo) {
        this.pointTwo = pointTwo;
    }

    public double calcDist(){
        // TODO
        this.zeroPoints=true;
        return Math.sqrt(Math.pow((this.pointOne.x - this.pointTwo.x), 2) + Math.pow((this.pointOne.y - this.pointTwo.y), 2));
    }

}

