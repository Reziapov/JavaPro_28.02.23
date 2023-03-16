package com.hillel.reziapov.homeworks.homework4.barrier;

public abstract class Participant {

    protected final String name;
    private final int maxHeight;
    private final int maxLength;
    private boolean isActive = true;
    private int passed;

    public Participant(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    public void overcome(Barrier barrier) {
        if (!isActive) {
            return;
        }

        boolean isOvercome = false;

        if (barrier instanceof Wall) {
            isOvercome = jump((Wall) barrier);
        } else if (barrier instanceof Treadmill) {
            isOvercome = run((Treadmill) barrier);
        }

        if (isOvercome) {
            passed += 100;
        } else {
            isActive = false;
            System.out.println(this + " did not pass the barrier " +
                    barrier + " at a distance " + (passed + 100) + ". Passed: " + passed);
        }
    }

    private boolean run(Treadmill treadmill) {
        if (maxLength >= treadmill.getLength()) {
            System.out.println(this + " ran " + treadmill);
            return true;
        }
        return false;
    }

    private boolean jump(Wall wall) {
        if (maxHeight >= wall.getHeight()) {
            System.out.println(this + " jumped over " + wall);
            return true;
        }
        return false;
    }
}
