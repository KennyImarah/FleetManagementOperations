package company;

import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateEmployed;
    private String address;
    private String primaryRole;
    private double remunerationValue;
    private double hourlyRate;

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

    public String getLastName() {

        System.out.println("Name is Test");
        return lastName;
    }

    public String getDateEmployed() {
        return dateEmployed;
    }

    public String getAddress() {
        return address;
    }

    public double getRemunerationValue() {
        return remunerationValue;
    }

    public void setEmployeeInfo(){
        //scanner for name input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String fName = sc.nextLine();

        System.out.println("Enter Last Name");
        String lName = sc.nextLine();

        System.out.println("Employment Date");
        dateEmployed = sc.nextLine();


        System.out.println("Pay rate");
        hourlyRate = sc.nextDouble();
        sc.close();

    }

    public double calculatePay(){
        if(hourlyRate > 0) {
            return hourlyRate * 80;
        }

        return 0;
    }

}
