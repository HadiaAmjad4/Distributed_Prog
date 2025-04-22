package com.progDist.rentalService.data;

public class Car {
    private String plateNumber;
    private String brand;
    private double price;
    private String modelName;
    private boolean rented;

    public Car() {
        this.plateNumber = "";
        this.brand = "";
        this.price = 0.0;
        this.modelName = "";
        this.rented = false;
    }

    public Car(String plateNumber, String brand, double price, String modelName) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.modelName = modelName;
        this.rented = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                ", rented="+ rented + '\'' +
                '}';
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean isRented() {
        return rented;
    }

    // Setters
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    
}
