package main.java.shop.entities;


public class ElectronicDevice extends Product {
    protected int guaranteePeriod;

    public ElectronicDevice(String name, Double price, Integer quantity, String restriction, int guaranteePeriod) {
        super(name, price, quantity, restriction);
        this.guaranteePeriod = guaranteePeriod;
    }
}
