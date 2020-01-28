package com.company;

public class Main {

    public static void main(String[] args) {

        Employee person = new Employee();

        // Set and call repair class

        Repairs repair = new Repairs(20.4, 500,3000);
        repair.getRepairs();

         String employeeInfo = person.setEmployeeInfo();

        System.out.println( employeeInfo + " earned a total of "  + person.calculatePay() + " for the billing cycle");

    }

    }

