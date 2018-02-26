package main.java.shop.entities;


public class Computer extends ElectronicDevice {
    public Computer(String name, Double price, Integer quantity, String restriction) {
        super(name, price, quantity, restriction, 24);
    }

    public Double getPrice() {
        if (quantity > 1000) {
            return 0.95 * price;
        } else {
            return price;
        }
    }
}
