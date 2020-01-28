package com.company;

import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateEmployed;
    private String address;
    private String primaryRole;
    private double remunerationValue;
    private double hourlyRate;
    private double hoursWorked;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String dateEmployed, String address, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateEmployed = dateEmployed;
        this.address = address;
        this.remunerationValue = payRate;

    }

    public String getFirstName() {
        return firstName;
    }

//    public String getLastName() {
//        return lastName;
//    }

    public String getDateEmployed() {
        return dateEmployed;
    }

    public String getAddress() {
        return address;
    }

//    public double getRemunerationValue() {
//        return remunerationValue;
//    }

    public String setEmployeeInfo(){
        //Create employee input scanner
        Scanner sc = new Scanner(System.in);

        //scanner for name input
        System.out.println("Enter First Name ");
        String fName = sc.nextLine();

        System.out.println("Enter Last Name ");
        String lName = sc.nextLine();

        System.out.println("Employment Date ");
        dateEmployed = sc.nextLine();

        System.out.println("Hours Worked ");
        hoursWorked = sc.nextDouble();

        System.out.println("Pay rate ");
        hourlyRate = sc.nextDouble();
        sc.close();

        return fName + " " + lName;
    }

    double calculatePay(){

        if(hoursWorked > 0) {
            if(hoursWorked >= 80 ){
                System.out.println("Your total work hours for the cycle = " + hoursWorked + "; you did well");
            }
            if((hoursWorked >= 40) && (hoursWorked< 80) ){
                System.out.println("Your total work hours for the cycle = " + hoursWorked + "; you are on average, and needs to be more available");
            }

            else
                System.out.println("Your total work hours for the cycle = " + hoursWorked + " you are below average, and should improve on your work hours");
            }

            return hourlyRate * hoursWorked;

        }
}
