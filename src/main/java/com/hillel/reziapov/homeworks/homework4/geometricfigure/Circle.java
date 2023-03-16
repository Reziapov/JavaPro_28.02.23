package com.hillel.reziapov.homeworks.homework4.geometricfigure;

public class Circle implements GeometricFigure{
    private final double radius;

    @Override
    public double figureArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
