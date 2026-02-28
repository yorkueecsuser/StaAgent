import org.junit.Test;
import static org.junit.Assert.*;

public class CustomPointTest {

    @Test
    public void testShowBugWithEqualPoints() {
        CustomPoint pointA = new CustomPoint(1, 2);
        CustomPoint pointB = new CustomPoint(1, 2);
        CustomPoint demo = new CustomPoint(0, 0);
        
        // The following line should trigger the bug because it uses a method that doesn't properly override Object.equals
        assertTrue(demo.showBug(pointA, pointB)); // TRIGGER BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    }
    
    @Test
    public void testShowBugWithDifferentPoints() {
        CustomPoint pointA = new CustomPoint(1, 2);
        CustomPoint pointC = new CustomPoint(3, 4);
        CustomPoint demo = new CustomPoint(0, 0);
        
        // The following line should trigger the bug because it uses a method that doesn't properly override Object.equals
        assertFalse(demo.showBug(pointA, pointC)); // TRIGGER BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    }
}