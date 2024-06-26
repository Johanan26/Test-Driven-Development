package ie.atu.Week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
    Calc newCalc;

    @Test
    void testAdd() {
        newCalc = new Calc();
        assertEquals(10, newCalc.add(4, 6));
    }

    @Test
    void testSubtract() {
        newCalc = new Calc();
        assertEquals(-3, newCalc.subtract(3, 6));
    }

    @Test
    void testDiv() {
        newCalc = new Calc();
        assertEquals(5, newCalc.Div(10, 2));
    }

    @Test
    void testMult() {
        newCalc = new Calc();
        assertEquals(20, newCalc.Mult(10, 2));
    }
}
