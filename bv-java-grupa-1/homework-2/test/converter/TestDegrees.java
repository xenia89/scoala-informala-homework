package converter;

import org.junit.Test;

import static converter.Degrees.turnToCelsius;
import static org.junit.Assert.assertEquals;

public class TestDegrees {
    @Test
    public void testDegreesConverter(){
        double temp=turnToCelsius(70);
        assertEquals(21.11,temp,0.01);

    }
}
