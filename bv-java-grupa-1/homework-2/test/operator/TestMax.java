package operator;

import org.junit.Test;

import static operator.Max.getMax;
import static org.junit.Assert.assertEquals;

public class TestMax {
    @Test
    public void testMaximum(){
        int max=getMax(4,7);
        assertEquals(7,max);

    }

}
