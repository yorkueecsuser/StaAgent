import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void showBugTest() {
        A a = new A(1);
        B b = new B(1, "B");

        // TRIGGER BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC)
        // The bug is triggered when comparing an instance of B with an instance of A, where B's equals method checks if the object is an instance of B before comparing it with an instance of A.
        // The bug is triggered at lines 14 and 15.
        assertTrue(a.equals(b)); // This should be true based on A's equals method
        assertFalse(b.equals(a)); // This should be false because B's equals method checks if the object is an instance of B
    }
}