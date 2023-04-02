package com.hillel.reziapov.homeworks.homework7.coffee.order;

public class Order {

    private int number;
    private String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order # " + number + " for " + customerName;
    }
    }


