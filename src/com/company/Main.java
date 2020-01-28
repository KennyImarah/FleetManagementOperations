package com.company;

public class Main {

    public static void main(String[] args) {

        Employee person = new Employee();

         String employeeInfo = person.setEmployeeInfo();

        System.out.println( employeeInfo + " earned a total of "  + person.calculatePay() + " for the billing cycle");

    }

    }

