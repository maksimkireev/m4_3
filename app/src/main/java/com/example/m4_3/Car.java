package com.example.m4_3;

public class Car {
    private String brand;
    private String description;
    private String market_price;
    private int resImage;

    public Car(String brand, String description, String market_price, int resImage) {
        this.brand = brand;
        this.description = description;
        this.market_price = market_price;
        this.resImage = resImage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public int getResImage() {
        return resImage;
    }

    public void setResImage(int resImage) {
        this.resImage = resImage;
    }
}