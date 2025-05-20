package junit;

import logic.Rectangle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleJUnitTest {

    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(5.0, 3.0);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals(5.0, rectangle.getLength(), 0.001);
        assertEquals(3.0, rectangle.getWidth(), 0.001);
    }

    @Test
    public void testSetLength() {
        rectangle.setLength(7.0);
        assertEquals(7.0, rectangle.getLength(), 0.001);
    }

    @Test
    public void testSetWidth() {
        rectangle.setWidth(4.5);
        assertEquals(4.5, rectangle.getWidth(), 0.001);
    }

    @Test
    public void testGetArea() {
        rectangle.setLength(4.0);
        rectangle.setWidth(2.5);
        assertEquals(10.0, rectangle.getArea(), 0.001);
    }
}
