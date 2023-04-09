package com.hillel.reziapov.homeworks.homework8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();
        navigator.add(new FileData("files.txt", 100, "/path/to/file"));
        navigator.add(new FileData("firstApp.java", 200, "/path/to/file"));
        System.out.println(navigator.find("/path/to/file"));
        System.out.println(navigator.filterBySize(150));
        System.out.println(navigator.sortBySize());
        navigator.remove("/path/to/file");
        navigator.add(new FileData("README.md", 200, "/another/path"));
    }


}

