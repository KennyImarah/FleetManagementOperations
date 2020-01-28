package com.company;

import java.util.Scanner;

public class Repairs extends Expenditure {


    private String vehicleId;
    private String repairDescription;
    private String autoPart;
    private double costOfPart;
    private double lastCostOfPart;
    private String previousRepairDate;
    private double serviceCharge;
    private int currentRepairDate;



    public Repairs(double purchases, double serviceCharge, double salaries, double adminAndDocumentation,
                   String autoPart, String vehicleId,String description, double costOfPart, double lastCostOfPart, String previousRepairDate,
                   double serviceCharge1, int currentRepairDate) {

        super(purchases, serviceCharge, salaries, adminAndDocumentation);
        this.autoPart = autoPart;
        this.vehicleId = vehicleId;
        this.repairDescription = description;
        this.costOfPart = costOfPart;
        this.lastCostOfPart = lastCostOfPart;
        this.serviceCharge = serviceCharge1;
        this.previousRepairDate = previousRepairDate;
        this.currentRepairDate = currentRepairDate;


    }


    public Repairs(double purchases, double salaries, double adminAndDocumentation) {
        super(purchases, 2500, salaries, adminAndDocumentation);
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public String getAutoPart() {
        return autoPart;
    }

    public double getCostOfPart() {
        return costOfPart;
    }

    public double getLastCostOfPart() {
        return lastCostOfPart;
    }

    public String getPreviousRepairDate() {
        return previousRepairDate;
    }

    @Override
    public double getServiceCharge() {
        return serviceCharge;
    }

    public int getCurrentRepairDate() {
        return currentRepairDate;
    }

    public String setRepairs() {

        Scanner sc = new Scanner(System.in);

        //scanner for name input
        System.out.println("Enter vehicle Id ");
        String vehicleId = sc.nextLine();
        String idRecord = vehicleId;

        System.out.println("Enter Repair Description ");
        String Description = sc.nextLine();

        System.out.println("Enter Auto Part Information ");
        String AutoPart = sc.nextLine();

        System.out.println("Enter Auto Part Cost ");
        double autoPartCost = sc.nextDouble();


        return idRecord + " " + autoPartCost;
    }


}
