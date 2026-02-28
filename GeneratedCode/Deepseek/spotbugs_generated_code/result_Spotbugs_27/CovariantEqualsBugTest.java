import org.junit.Test;
import static org.junit.Assert.*;

public class CovariantEqualsBugTest {

    @Test
    public void testShowBug() {
        CovariantEqualsBug bug1 = new CovariantEqualsBug("bug");
        CovariantEqualsBug bug2 = new CovariantEqualsBug("bug");
        Object obj = new Object();

        bug1.showBug(bug2); // Using covariant equals() and Object's equals(), they should return different results
        assertFalse(bug1.equals(obj)); // TRIGGER BUG: Covariant equals() method is not being used here, causing the test to fail
    }
}