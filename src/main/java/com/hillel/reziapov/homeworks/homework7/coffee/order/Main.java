package com.hillel.reziapov.homeworks.homework7.coffee.order;


public class Main {
    public static void main(String[] args) {

        testCreateOrders();
        System.out.println("=====");

        testDeliverFirst();
        System.out.println("=====");

        testDeliverSpecific();
        System.out.println("=====");

        testTwoBoards();
    }

    private static void testCreateOrders() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add(new Order("Alen"));
        board.add(new Order("Yoda"));
        board.add(new Order("Obi-van"));
        board.add(new Order("John Snow"));

        board.draw();
    }

    private static void testDeliverFirst() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add(new Order("Alen"));
        board.add(new Order("Yoda"));
        board.add(new Order("Obi-van"));
        board.add(new Order("John Snow"));

        board.deliver();

        board.draw();
    }

    private static void testDeliverSpecific() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add(new Order("Alen"));
        int yodaOrder = board.add(new Order("Yoda"));
        board.add(new Order("Obi-van"));
        board.add(new Order("John Snow"));

        board.deliver(yodaOrder);

        board.draw();
    }

    private static void testTwoBoards() {
        CoffeeOrderBoard boardFirst = new CoffeeOrderBoard();

        boardFirst.add(new Order("Alen"));
        boardFirst.add(new Order("Yoda"));

        CoffeeOrderBoard boardSecond = new CoffeeOrderBoard();

        boardSecond.add(new Order("Obi-van"));
        boardSecond.add(new Order("John Snow"));


        boardFirst.draw();
        boardSecond.draw();
    }

}

