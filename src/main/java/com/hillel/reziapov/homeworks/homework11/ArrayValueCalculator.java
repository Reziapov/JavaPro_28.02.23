package com.hillel.reziapov.homeworks.homework11;


import com.hillel.reziapov.homeworks.homework11.exceptionClass.ArrayDataException;
import com.hillel.reziapov.homeworks.homework11.exceptionClass.ArraySizeException;

public class ArrayValueCalculator {


    public static int doCalc(String[][] matrix) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != 4 || matrix[i].length != 4)
                    throw new ArraySizeException("Matrix is incorrect (must be 4x4 in size)");
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Incorrect array's data : " + i + " - " + j);
                }
            }
        }
        System.out.println("calculation result:");
        return sum;
    }
}
