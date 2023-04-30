package com.hillel.reziapov.homeworks.homework10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadPopularWords {

    public List<String> readAll(String name) throws IOException {
        List<String> words;
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            words = reader.lines().
                    flatMap(s -> Arrays.stream(s.split(" "))).
                    map(s -> s.replaceAll("[^a-z0-9]", "")).
                    filter(s -> s.length() > 2).toList();
        }
        return words;
    }
}
