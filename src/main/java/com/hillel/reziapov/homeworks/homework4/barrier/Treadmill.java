package com.hillel.reziapov.homeworks.homework4.barrier;

public class Treadmill extends Barrier{

    private final int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        return name;
    }
}
