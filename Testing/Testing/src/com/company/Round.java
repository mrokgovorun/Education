package com.company;

public class Round {
    int natX;
    private int natY;
    private int radiusR;

    public int getNatX() {
        return this.natX;
    }

    public int getNatY() {
        return this.natY;
    }

    public int getRadiusR() {
        return this.radiusR;
    }

    public void setNatX(int natX) {
        this.natX = natX;
    }

    public void setNatY(int natY) {
        this.natY = natY;
    }

    public void setRadiusR(int radiusR) {
        this.radiusR = radiusR;
    }

    public void writeLength() {
        double p = 3.1415;
        double L = 2 * p * this.radiusR;
        System.out.println(L);
    }

    //Еще способ посчитать длину окружности
    //Метод возвращает значение типа double
    //Используется математическая константа
    public double getLength() {
        return 2 * Math.PI * this.radiusR;
    }

}
