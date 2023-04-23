package com.hillel.reziapov.homeworks.homework9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static java.util.stream.Collectors.*;

public class Product implements Comparable<Product> {


    private final String type;
    private final double price;
    private final boolean discount;
    private final LocalDateTime localDateTime;
    private final int currentYear = LocalDate.now().getYear();

    public Product(String type, double price, boolean discount, LocalDateTime localDateTime) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.localDateTime = localDateTime;
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

