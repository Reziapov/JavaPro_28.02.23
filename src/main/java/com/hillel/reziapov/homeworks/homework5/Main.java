package com.hillel.reziapov.homeworks.homework5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Poland");
        myArrayList.add("Germany");
        myArrayList.add("USA");
        myArrayList.add("USA");
        myArrayList.add("France");
        myArrayList.add("Israel");
        myArrayList.add("Israel");
        myArrayList.add("Israel");
        myArrayList.add("Norway");
        myArrayList.add("Chine");
        myArrayList.add("Brazil");
        myArrayList.add("Ukraine");
        myArrayList.add("Ukraine");
        countOccurrence(myArrayList, "Israel");


        List<Integer> uniqueList = new LinkedList<>();
        uniqueList.add(12);
        uniqueList.add(10);
        uniqueList.add(10);
        uniqueList.add(9);
        uniqueList.add(5);
        uniqueList.add(9);
        System.out.println(findUnique(uniqueList));


        int[] intArray = {1, 2, 3};
        List<Integer> intList = toList(intArray);
        System.out.println(intList);
        calcOccurrence();



    }


    private static void countOccurrence(List<String> words, String word) {
        long myArrayList = Data.getMyArrayList().stream()
                .filter(p -> p.equals(word))
                .count();
        System.out.println(word + ": " + myArrayList);
    }

    protected static List<Integer> toList(int[] array) {

        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }
        return list;


    }

    public static List<Integer> findUnique(List<Integer> inputList) {

        for (int i = 0; i < inputList.size(); i++) {
            Integer currentElement = inputList.get(i);
            boolean isUnique = true;

            for (int j = 0; j < inputList.size(); j++) {
                if (i != j && currentElement.equals(inputList.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                inputList.add(currentElement);
            }
        }

        return inputList;
    }

    private static void calcOccurrence() {

        Map<String, Integer> myArrayList = new HashMap<>();
        for (String p : Data.getMyArrayList()) {
            myArrayList.merge(p, 1, Integer::sum);
        }
        System.out.println(myArrayList);


    }


    }

