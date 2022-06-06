import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTestTwo {

    @Test
    public void testMult(){
        Calculation cal = new Calculation();
        assertEquals(4, cal.multiply(2,2));
    }
}
