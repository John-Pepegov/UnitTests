package junit;

import logic.EvenOddChecker;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EvenOddCheckerJUnitTest {

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
        assertTrue(EvenOddChecker.check(0)); // 0 считается чётным
    }

    @Test
    public void testNegativeEven() {
        assertTrue(EvenOddChecker.check(-2));
    }

    @Test
    public void testNegativeOdd() {
        assertFalse(EvenOddChecker.check(-3));
    }

    @Test
    public void testConstructor() {
        new EvenOddChecker(); // просто вызов конструктора
    }
}