package com.hillel.reziapov.homeworks.homework12;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {

        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanNumerals.get(s.charAt(i));
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        System.out.println(result);
        return result;
    }

}
