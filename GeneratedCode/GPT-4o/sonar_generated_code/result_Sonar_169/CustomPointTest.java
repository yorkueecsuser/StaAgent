import org.junit.Test;
import static org.junit.Assert.*;

public class CustomPointTest {

    @Test
    public void testEqualsWithSamePoints() {
        CustomPoint point1 = new CustomPoint(1, 2);
        CustomPoint point2 = new CustomPoint(1, 2);

        // This will trigger the bug because "showBug" uses the incorrect "equals" method
        assertTrue(point1.showBug(point2)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsWithDifferentPoints() {
        CustomPoint point1 = new CustomPoint(1, 2);
        CustomPoint point3 = new CustomPoint(2, 3);

        // This will trigger the bug because "showBug" uses the incorrect "equals" method
        assertFalse(point1.showBug(point3)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsWithObject() {
        CustomPoint point1 = new CustomPoint(1, 2);
        Object point2 = new CustomPoint(1, 2);

        // This fails because the equals method is not overridden for Object
        assertTrue(point1.equals(point2)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }
}