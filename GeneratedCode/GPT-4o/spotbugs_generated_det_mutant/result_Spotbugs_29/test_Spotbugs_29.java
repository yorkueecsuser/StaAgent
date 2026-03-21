import org.junit.Test;
import static org.junit.Assert.*;

public class CustomEqualsTest {

    @Test
    public void testEqualsWithIdenticalObjects() {
        CustomEquals obj1 = new CustomEquals(1, "Test");
        CustomEquals obj2 = new CustomEquals(1, "Test");
        assertTrue(obj1.showBug(obj2)); // TRIGGER BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
    }

    @Test
    public void testEqualsWithDifferentObjects() {
        CustomEquals obj1 = new CustomEquals(1, "Test");
        CustomEquals obj3 = new CustomEquals(2, "Test");
        assertFalse(obj1.showBug(obj3)); // TRIGGER BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
    }
}