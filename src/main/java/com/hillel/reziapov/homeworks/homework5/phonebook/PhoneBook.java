package com.hillel.reziapov.homeworks.homework5.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {

    private static List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public static void add(Record record) {

        records.add(record);
    }

    public Record find(String name) {
        return records.stream()
                .filter(r -> r.getName().equals(name))
                .findFirst()
                .orElse(null);

    }

    public List<Record> findAll(String name) {
        return records.stream()
                .filter(r -> r.getName().equals(name))
                .collect(Collectors.toList());
    }

}

