package com.hillel.reziapov.homeworks.homework4.geometricfigure;

public class Square implements GeometricFigure{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double figureArea() {
        return Math.pow(side, 2);
    }
}
