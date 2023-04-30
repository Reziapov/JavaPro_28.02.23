package com.hillel.reziapov.homeworks.homework10;

import java.io.FileWriter;
import java.io.IOException;


public class WordStatistics {

    public void saveStatistic(String...words) throws IOException {
        try (FileWriter writer = new FileWriter("statistic.txt")) {
            for (String word : words) {
                writer.write(word);
            }
        }
    }

}
