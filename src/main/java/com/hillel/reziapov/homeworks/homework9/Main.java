package com.hillel.reziapov.homeworks.homework9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product.categoryProduct();
        List<Product> productByName = new ArrayList<>();
        productByName.add(new Product("Book", 250.0, true));
        productByName.add(new Product("Book", 255.0, true));
        productByName.add(new Product("Book", 50.0, false));
        productByName.add(new Product("Stationery", 5.9, false));


        System.out.println(Product.discountProduct(productByName, "Book", 0.1));
        System.out.println();
        Product.cheapProduct();

        Product.dateAdded();
        Product.calculationProducts();
        System.out.println();
        Product.groupingOfObjects();


    }

}
