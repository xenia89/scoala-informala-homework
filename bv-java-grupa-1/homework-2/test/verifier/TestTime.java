package verifier;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static verifier.Time.validHour;
import static verifier.Time.validMinutes;
import static verifier.Time.validNumber;

public class TestTime {
    @Test
    public void testNumberLimits() {
        boolean nrLimit = validNumber(5, 2, 7);
        assertTrue(nrLimit);

    }
    @Test
    public void testHour(){
        boolean hh=validHour(7);
        assertTrue(hh);

    }
    @Test
    public void testMinutes(){
        boolean mm=validMinutes(45);
        assertTrue(mm);
    }

}

