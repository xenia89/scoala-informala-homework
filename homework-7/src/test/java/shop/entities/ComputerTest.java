package test.java.shop.entities;

import main.java.shop.entities.Computer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    @Test
    public void getPrice100Test(){
        Computer com = new Computer("C1",20.0,2,"Adult");
        assertEquals(20.0,com.getPrice(),0);
    }

    @Test
    public void getPrice95Test(){
        Computer com = new Computer("C1",20.0,1500,"Adult");
        assertEquals(19.0,com.getPrice(),0);
    }
}
