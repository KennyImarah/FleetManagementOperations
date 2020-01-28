package com.company;

import java.util.Scanner;

public class Income {
 public double clientRemittance;
 public double directDeposit;
 public double rental;


    public double getClientRemittance() {
        return clientRemittance;
    }

    public double getDirectDeposit() {
        return directDeposit;
    }

    public double getRental() {
        return rental;
    }

    public Income(double clientRemittance, double directDeposit, double rental) {
        this.clientRemittance = clientRemittance;
        this.directDeposit = directDeposit;
        this.rental = rental;


    }
}
