package com.hillel.reziapov.homeworks.homework10;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    private static final String PATH = "src/main/java/com/hillel/reziapov/homeworks/homework10/";

    public static void main(String[] args) {
        ReadPopularWords popularWords = new ReadPopularWords();
        WordStatistics wordStatistics = new WordStatistics();
        WordCount wordCount = new WordCount();
        LocalDateTime localDateTime = LocalDateTime.now();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name! ");
        String bookName = scanner.nextLine();
        List<String> words;
        try {
            words = popularWords.readAll(PATH + bookName + ".txt");
        } catch (IOException e) {
            System.out.println("THIS BOOK ^" + bookName.toUpperCase() + "^ IS NOT FOUND OR YET NOT CREATED");
            return;
        }

        Map<String, Long> repeatedWords = wordCount.countWords(words);
        int unique = wordCount.countUnique(words);

        try {
            wordStatistics.saveStatistic("STATISTIC " + localDateTime + "\n"
                    + repeatedWords.toString(), "\nUnique words: " + unique);
        } catch (IOException e) {
            System.out.println("Can`t save! Try again");
            return;
        }

        System.out.println("Repeated words: " + repeatedWords);
        System.out.println("Unique words: " + wordCount.countUnique(words));

        scanner.close();

    }
}








