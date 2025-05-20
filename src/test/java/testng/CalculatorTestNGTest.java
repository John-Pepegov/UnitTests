package testng;

import logic.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTestNGTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(calculator.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        assertEquals(calculator.subtract(3, 2), 1);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculator.multiply(2, 3), 6);
    }

    @Test
    public void testDivide() {
        assertEquals(calculator.divide(6, 3), 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }
}
