package com.hillel.reziapov.homeworks.homework10;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public Map<String, Long> countWords(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting())).entrySet().
                stream().sorted((l, r) -> Math.toIntExact(r.getValue() - l.getValue())).limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public int countUnique(List<String> words) {
        return new HashSet<>(words).size();
    }
}
