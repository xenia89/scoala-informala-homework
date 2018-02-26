package main.java.shop.entities;



public class Appliance extends ElectronicDevice {

    public Appliance(String name, Double price, Integer quantity, String restriction) {
        super(name, price, quantity, restriction, 6);
    }

    public Double getPrice() {
        if (quantity < 50) {
            return 1.05 * price;
        } else {
            return price;
        }
    }
}
