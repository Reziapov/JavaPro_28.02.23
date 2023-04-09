package com.hillel.reziapov.homeworks.homework9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Product implements Comparable<Product> {


    private final String type;
    private final double price;
    private boolean discount;
    private LocalDateTime localDateTime;
    private int currentYear = LocalDate.now().getYear();

    public Product(String type, double price, boolean discount, LocalDateTime localDateTime) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.localDateTime = localDateTime;
    }

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Product(String type, double price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public static void categoryProduct() {
        List<Product> productByName = Data.getProductByName();
        System.out.println(productByName);
        System.out.println();
        List<Product> productByName2 = productByName.stream()
                .filter(p -> p.getType().equals("Book"))
                .filter(p -> p.getPrice() > 250.0)
                .collect(toList());

        System.out.println(productByName2);

    }

    public static List<Product> discountProduct(List<Product> products, String type, double discount) {

        return products.stream()
                .filter(p -> p.getType().equals(type) && p.isDiscount())
                .map(p -> new Product(p.getType(), p.getPrice() * (1 - discount), false))
                .toList();
    }

    public static void cheapProduct() {
        List<Product> productByName = Data.getProductByName();
        Optional<Product> productByName2 = productByName.stream()
                .filter(p -> p.getType().equals("Book"))
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        if (productByName2.isPresent()) {
            System.out.println("cheap product: " + productByName2);
        } else {
            System.out.println("Product [category:" + productByName2.get() + " not found.");
        }

    }

    public static void dateAdded() {
        List<Product> productByName2 = Data.getProductByName2().stream()
                .sorted(Comparator.comparing(Product::getLocalDateTime))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(productByName2);
    }

    public static void calculationProducts() {

        double calculation = Data.getProductByName2().stream()
                .filter(p -> p.getLocalDateTime().getYear() == p.currentYear)
                .filter(Product::isDiscount)
                .filter(p -> p.getType().equals("Book"))
                .filter(p -> p.getPrice() < 75)
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println(calculation);
    }

    public static void groupingOfObjects() {
        Map<String, List<Product>> productsByType = Data.getProductByName2().stream()
                .collect(groupingBy(Product::getType));

        System.out.println(productsByType);


    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public boolean isDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return '\n' + "Product{" + "type='" + type + '\'' + ", price=" + price + ", discount=" + discount +
                ", localDateTime=" + localDateTime + '}' + '\n';
    }

    public int getCurrentYear() {
        return currentYear;
    }

    @Override
    public int compareTo(Product o) {
        return localDateTime.compareTo(o.getLocalDateTime());
    }
}

