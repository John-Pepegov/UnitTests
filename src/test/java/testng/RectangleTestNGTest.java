package testng;

import logic.Rectangle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RectangleTestNGTest {

    private Rectangle rectangle;

    @BeforeMethod
    public void setUp() {
        rectangle = new Rectangle(5.0, 3.0);
    }

    @Test
    public void testConstructorSetsLength() {
        assertEquals(rectangle.getLength(), 5.0, 0.001);
    }

    @Test
    public void testConstructorSetsWidth() {
        assertEquals(rectangle.getWidth(), 3.0, 0.001);
    }

    @Test
    public void testSetLength() {
        rectangle.setLength(8.5);
        assertEquals(rectangle.getLength(), 8.5, 0.001);
    }

    @Test
    public void testSetWidth() {
        rectangle.setWidth(6.2);
        assertEquals(rectangle.getWidth(), 6.2, 0.001);
    }

    @Test
    public void testGetArea() {
        rectangle.setLength(2.0);
        rectangle.setWidth(3.0);
        assertEquals(rectangle.getArea(), 6.0, 0.001);
    }
}
