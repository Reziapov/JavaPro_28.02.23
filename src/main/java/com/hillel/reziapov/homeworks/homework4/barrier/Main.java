package com.hillel.reziapov.homeworks.homework4.barrier;

public class Main {
    public static void main(String[] args) {

        Barrier[] barriers = new Barrier[]{
                new Treadmill("Treadmill-1", 5),
                new Wall("Wall-1", 5),
                new Treadmill("Treadmill-2", 10),
                new Wall("Wall-2", 20)
        };
        Participant[] participants = new Participant[]{
                new Cat("Bobik", 10, 10),
                new Cat("Sharik", 4, 10),
                new Human("Valera", 15, 10),
                new Human("Zoya", 2, 10),
                new Robot("Meizu", 100, 40)
        };
        for (Participant participant : participants) {
            for (Barrier barrier : barriers) {
                participant.overcome(barrier);
            }
        }
    }
}
