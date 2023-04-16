package com.hillel.reziapov.homeworks.homework5.phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();
        phonebook.add(new Record("John",123456789));
        phonebook.add(new Record("Jason", 789456123));
        phonebook.add(new Record("Helga",456789321));
        phonebook.add(new Record("John",456951753));

        Record jaksonRecord = phonebook.find("John");
        System.out.println(jaksonRecord);

        List<Record> jaksonRecords = phonebook.findAll("John");
        System.out.println(jaksonRecords);




    }
}
