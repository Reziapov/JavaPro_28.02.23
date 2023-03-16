package com.hillel.reziapov.homeworks.homework4.barrier;

public class Robot extends Participant{

    public Robot(String name, int maxHeight, int maxLength) {
        super(name, maxHeight, maxLength);
    }
    @Override
    public String toString() {
        return "Robot " + name;
    }
}
