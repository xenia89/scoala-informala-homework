package main.java.shop.entities;

import main.java.shop.interfaces.Expirable;


import java.util.Calendar;
import java.util.Date;

public class FoodProduct extends Product implements Expirable {

    private Date expirationDate;

    public FoodProduct(String name, Double price, Integer quantity, String restriction, Date expirationDate) {
        super(name, price, quantity, restriction);
        this.expirationDate = expirationDate;
    }


    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    public Double getPrice() {
        Date now = new Date();
        Calendar criticPeriod = Calendar.getInstance();
        criticPeriod.setTime(expirationDate);
        criticPeriod.add(Calendar.DATE, -15);

        if (criticPeriod.getTime().before(now)) {
            return price * 0.7;
        } else {
            return price;

        }
    }

    public Boolean isExpired() {
        Date now = new Date();
        if (expirationDate.before(now)) {
            return true;
        } else {
            return false;

        }
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
