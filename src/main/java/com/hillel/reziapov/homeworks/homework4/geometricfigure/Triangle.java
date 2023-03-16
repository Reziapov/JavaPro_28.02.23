package com.hillel.reziapov.homeworks.homework4.geometricfigure;

public class Triangle implements GeometricFigure{
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double figureArea() {
        return 0.5 * height * base;
    }
}
