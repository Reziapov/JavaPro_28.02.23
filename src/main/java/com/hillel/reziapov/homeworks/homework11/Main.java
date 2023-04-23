package com.hillel.reziapov.homeworks.homework11;

import com.hillel.reziapov.homeworks.homework11.exceptionClass.ArrayDataException;
import com.hillel.reziapov.homeworks.homework11.exceptionClass.ArraySizeException;

public class Main {
    public static void main(String[] args) {
        try {
            int result = ArrayValueCalculator.doCalc(new String[][]
                    {{"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"9", "10", "11", "12"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

    }
}

