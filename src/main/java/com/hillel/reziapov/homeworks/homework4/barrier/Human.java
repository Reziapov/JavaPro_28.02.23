package com.hillel.reziapov.homeworks.homework4.barrier;

public class Human extends Participant{

    public Human(String name, int maxHeight, int maxLength) {
        super(name, maxHeight, maxLength);
    }

    @Override
    public String toString() {
        return "Human " + name;
    }
}
