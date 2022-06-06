import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatioTestOne {

    @Test
    public void testAdd(){
        Calculation cal = new Calculation();
        assertEquals(4, cal.add(2,2));
    }

    @Test
    public void testSub(){
        Calculation cal = new Calculation();
        assertEquals(2, cal.substract(4,2));
    }
}
