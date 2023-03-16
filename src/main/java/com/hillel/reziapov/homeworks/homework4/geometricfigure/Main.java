package com.hillel.reziapov.homeworks.homework4.geometricfigure;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Circle circle1 = new Circle(5.1);
        Circle circle2 = new Circle(3.2);
        Square square = new Square(4.2);
        Square square1 = new Square(7.7);
        Triangle triangle = new Triangle(6.2, 4.1);
        Triangle triangle1 = new Triangle(3.9, 8.1);

        GeometricFigure[] figures = new GeometricFigure[]{
                circle,
                circle1,
                circle2,
                square1,
                square,
                triangle1,
                triangle
        };
        System.out.println("Total area of figures in array: " + getTotalArea(figures));
    }

    public static double getTotalArea(GeometricFigure[] figures) {
        double totalArea = 0;
        for (GeometricFigure figureWithArea : figures) {
            totalArea += figureWithArea.figureArea();
        }
        return totalArea;
    }


}
