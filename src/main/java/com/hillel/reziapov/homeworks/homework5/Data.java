package com.hillel.reziapov.homeworks.homework5;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<String> myArrayList = new ArrayList<>();
    static {
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
    }


    public static List<String> getMyArrayList() {
        return myArrayList;
    }
}
