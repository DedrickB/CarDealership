package com.pluarlsight;

public class Vehicle {
    //--- Fields (Attributes) --- //
    private int vin;
    private int year;
    private String make;
    private String model;
    private String color;
    private String vehicleType;
    private int odometer;
    private double price;


    // --- Constructor --- //
    public Vehicle(int vin, int year, String make, String model, String color, String vehicletype, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vehicleType = vehicletype;
        this.odometer = odometer;
        this.price = price;


    }

    // --- Getters --- //
    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
        return odometer;
    }

    public double getPrice() {
        return price;
    }


    // --- Setters --- //
    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // --- toString() Method ---//
    @Override
    public String toString() {
        return String.format("VIN: %d | Year: %d | Make: %s | Model: %s | Type: %s | Color: %s | Miles: %d | Price: $%.2f",
                vin, year, make, model, vehicleType, color, odometer, price);


    }
}




