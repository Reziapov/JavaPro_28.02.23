package com.hillel.reziapov.homeworks.homework9;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Methods {

    public static List<Product> allProducts() {
        List<Product> productByName = Data.getProductByName();

        productByName = productByName.stream()
                .filter(p -> p.getType().equals("Book"))
                .filter(p -> p.getPrice() > 250.0)
                .collect(toList());

        return productByName;

    }

    public static List<Product> discountApplicationProduct(List<Product> products, String type, double discount) {

        return products.stream()
                .filter(p -> p.getType().equals(type) && p.isDiscount())
                .map(p -> new Product(p.getType(), p.getPrice() * (1 - discount), false,
                        LocalDateTime.of(2022, 4, 9, 15, 22, 0)))
                .toList();
    }

    public static void gettingCheapestProduct() {
        try {
            List<Product> productByName = Data.getProductByName();
            Optional<Product> productByName2 = productByName.stream()
                    .filter(p -> p.getType().equals("Book"))
                    .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
            if (productByName2.isPresent()) {
                System.out.println("cheap product: " + productByName2);
            } else {
                System.out.println("Product [category:" + productByName2.get() + " not found.");
            }
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }

    public static void gettingTheLastAddedProducts() {
        List<Product> productByName2 = Data.getProductByName().stream()
                .sorted(Comparator.comparing(Product::getLocalDateTime))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(productByName2);
    }

    public static double calculationTheTotalCostProducts() {

        double calculation = Data.getProductByName().stream()
                .filter(p -> p.getLocalDateTime().getYear() == p.getCurrentYear())
                .filter(Product::isDiscount)
                .filter(p -> p.getType().equals("Book"))
                .filter(p -> p.getPrice() < 75)
                .mapToDouble(Product::getPrice)
                .sum();

        return calculation;
    }

    public static Map<String, List<Product>> groupingOfObjectsByProductType() {
        Map<String, List<Product>> productsByType = Data.getProductByName().stream()
                .collect(groupingBy(Product::getType));

        return productsByType;


    }



}
