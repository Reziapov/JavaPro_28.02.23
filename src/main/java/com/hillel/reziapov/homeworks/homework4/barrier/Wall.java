package com.hillel.reziapov.homeworks.homework4.barrier;

public class Wall extends Barrier {

    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name;
    }
}
