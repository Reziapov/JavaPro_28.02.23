package com.hillel.reziapov.homeworks.homework9;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private static List<Product> productByName = new ArrayList<>();


    static {
        productByName.add(new Product("Book", 250.0, true,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Book", 255.0,true,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Book", 50.0,true,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Book", 3.50,false,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Book", 300.0,true,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Stationery", 5.9,false,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));

    }


    public static List<Product> getProductByName() {
        return productByName;
    }



}
