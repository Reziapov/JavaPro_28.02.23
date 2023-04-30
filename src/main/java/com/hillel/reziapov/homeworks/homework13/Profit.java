package com.hillel.reziapov.homeworks.homework13;

public class Profit {

    public static void maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        System.out.println(maxProfit);

    }
}
