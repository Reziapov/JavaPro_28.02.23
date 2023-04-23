package com.hillel.reziapov.homeworks.homework9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Methods.allProducts();
        List<Product> productByName = new ArrayList<>();
        productByName.add(new Product("Book", 250.0, true,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Book", 255.0, true,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Book", 50.0, false,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));
        productByName.add(new Product("Stationery", 5.9, false,
                LocalDateTime.of(2022, 4, 9, 15, 22, 0)));


        System.out.println(Methods.discountApplicationProduct(productByName, "Book", 0.1));
        System.out.println();
        Methods.gettingCheapestProduct();

        Methods.gettingTheLastAddedProducts();
        Methods.calculationTheTotalCostProducts();
        System.out.println();
        Methods.groupingOfObjectsByProductType();


    }

}
