package com.vehicleapp;

public class Vehicle {
    private String model;
    private String brand;
    private int year;

    public Vehicle(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Modelo: " + model + ", Marca: " + brand + ", Ano: " + year;
    }
}
