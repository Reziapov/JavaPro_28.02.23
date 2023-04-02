package com.hillel.reziapov.homeworks.homework7.coffee.order;


import java.util.LinkedList;


public class CoffeeOrderBoard {
    private int lastOrderNumber = 0;
    private final LinkedList<Order> orders = new LinkedList<>();

    public int add(Order order) {
        lastOrderNumber++;
        order.setNumber(lastOrderNumber);
        orders.add(order);

        return lastOrderNumber;
    }

    public Order deliver() {
        return orders.poll();
    }

    public Order deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getNumber() == orderNumber) {
                return orders.remove(i);
            }
        }

        System.out.println("Cannot find order " + orderNumber);
        return null;
    }

    public void draw() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}




