package com.company;

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

}
