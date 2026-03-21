import org.junit.Test;
import static org.junit.Assert.*;

public class CustomEqualityTest {

    @Test
    public void testEqualsWithSameAttributes() {
        CustomEquality obj1 = new CustomEquality("Alice", 1);
        CustomEquality obj2 = new CustomEquality("Alice", 1);
        assertTrue(CustomEquality.showBug(obj1, obj2)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsWithDifferentAttributes() {
        CustomEquality obj1 = new CustomEquality("Alice", 1);
        CustomEquality obj3 = new CustomEquality("Bob", 2);
        assertFalse(CustomEquality.showBug(obj1, obj3)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsWithNull() {
        CustomEquality obj1 = new CustomEquality("Alice", 1);
        assertFalse(CustomEquality.showBug(obj1, null)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsWithDifferentType() {
        CustomEquality obj1 = new CustomEquality("Alice", 1);
        Object obj = new Object();
        // This should return false, but due to the incorrect equals method signature, it could lead to issues
        assertFalse(CustomEquality.showBug(obj1, (CustomEquality)obj)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }
}