package com.company;

import java.util.Scanner;

public class Currency {

    private String currencyType;

    public String getCurrencyCode() {

        //scanner for name input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Currency: ");
        String currency = sc.nextLine();
        System.out.println("Enter Currency: ");
        sc.close();

        return currency;
    }
}