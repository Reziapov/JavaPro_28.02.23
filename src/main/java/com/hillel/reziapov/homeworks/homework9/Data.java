package com.hillel.reziapov.homeworks.homework9;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private static List<Product> productByName = new ArrayList<>();
    private static List<Product> productByName2 = new ArrayList<>();

    static {
        productByName.add(new Product("Book", 250.0));
        productByName.add(new Product("Book", 255.0));
        productByName.add(new Product("Book", 50.0));
        productByName.add(new Product("Book", 3.50));
        productByName.add(new Product("Book", 300.0));
        productByName.add(new Product("Stationery", 5.9));

    }

    static {
        productByName2.add(new Product("Book", 200, true,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));

        productByName2.add(new Product("Book", 70, true,
                LocalDateTime.of(2019, 4, 9, 16, 20, 30)));

        productByName2.add(new Product("Book", 55, true,
                LocalDateTime.of(2023, 4, 9, 16, 20, 30)));

        productByName2.add(new Product("Book", 68, true,
                LocalDateTime.of(2023, 4, 9, 16, 20, 30)));

        productByName2.add(new Product("Phone", 300, false,
                LocalDateTime.of(2023, 4, 9, 16, 22, 48)));

        productByName2.add(new Product("Laptop", 1500, false,
                LocalDateTime.of(2023, 4, 9, 15, 20, 0)));
    }


    public static List<Product> getProductByName() {
        return productByName;
    }

    public static List<Product> getProductByName2() {
        return productByName2;
    }

}
