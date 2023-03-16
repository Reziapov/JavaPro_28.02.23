package com.hillel.reziapov.homeworks.homework4.barrier;

public class Cat extends Participant{

    public Cat(String name, int maxHeight, int maxLength) {
        super(name, maxHeight, maxLength);
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
