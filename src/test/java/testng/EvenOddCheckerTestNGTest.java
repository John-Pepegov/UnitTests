package testng;

import logic.EvenOddChecker;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class EvenOddCheckerTestNGTest {

    @Test
    public void testEvenNumber() {
        assertTrue(EvenOddChecker.check(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(EvenOddChecker.check(7));
    }

    @Test
    public void testZero() {
        assertTrue(EvenOddChecker.check(0));
    }

    @Test
    public void testNegativeEven() {
        assertTrue(EvenOddChecker.check(-6));
    }

    @Test
    public void testNegativeOdd() {
        assertFalse(EvenOddChecker.check(-1));
    }

    @Test
    public void testConstructor() {
        new EvenOddChecker();
    }
}
