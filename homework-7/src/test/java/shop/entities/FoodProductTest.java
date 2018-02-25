package test.java.shop.entities;

import main.java.shop.entities.FoodProduct;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FoodProductTest {

    FoodProduct bread;

    @Before
    public void setup() throws ParseException {
        String inputString = "01-01-2019";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDate = dateFormat.parse(inputString);

        bread = new FoodProduct("bread",20.0,2,"Adult", inputDate);
    }
    @Test
    public void getPrice100Test(){

        assertEquals(20.0,bread.getPrice(),0);
    }

    @Test
    public void getPrice970Test() throws ParseException {
        String inputString = "05-02-2018";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDate = dateFormat.parse(inputString);

        bread.setExpirationDate(inputDate);
        assertEquals(14.0,bread.getPrice(),0);
    }

    @Test
    public void isNotExpiredTest() throws ParseException {
        assertFalse(bread.isExpired());
    }

    @Test
    public void isExpiredTest() throws ParseException {
        String inputString = "02-05-2017";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDate = dateFormat.parse(inputString);

        bread.setExpirationDate(inputDate);
        assertTrue(bread.isExpired());
    }
}
