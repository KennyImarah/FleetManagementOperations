package com.company;

public class Vehicle {
    private String name;
    private String vehicleNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Vehicle(String name, String vehicleNumber) {
        this.name = name;
        this.vehicleNumber = vehicleNumber;
    }


}

