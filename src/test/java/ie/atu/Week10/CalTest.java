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
}