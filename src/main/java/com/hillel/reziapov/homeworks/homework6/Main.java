package com.hillel.reziapov.homeworks.homework6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(""));
        System.out.println();

        int[] numbers = {1, 2, 3, 1};
        boolean hasDuplicate = containsDuplicate(numbers);
        System.out.println(hasDuplicate);
        System.out.println();

        int[] number = {3,2,4};
        int target = 6;
        int[] Sum = twoSum(number,target);
        System.out.println(Arrays.toString(Sum));

    }

    public static boolean isPalindrome(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll("[^a-z0-9]", "");
        String string = String.valueOf(phrase);

        int i = 0;
        int j = string.length() - 1;

        while (i <= j) {
            if (string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            if (set.contains(number)) {
                return true;
            }
            set.add(number);
        }
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two elements in the array add up to the target.");
    }

}

