import org.junit.Test;
import static org.junit.Assert.*;

public class CovariantEqualsBugExampleTest {

    @Test
    public void testShowBugWithSameValues() {
        CovariantEqualsBugExample example1 = new CovariantEqualsBugExample("example");
        CovariantEqualsBugExample example2 = new CovariantEqualsBugExample("example");
        assertTrue(example1.showBug(example2)); // This should pass
    }

    @Test
    public void testEqualsWithObjectReference() {
        CovariantEqualsBugExample example1 = new CovariantEqualsBugExample("example");
        Object example3 = new CovariantEqualsBugExample("example");
        assertTrue(example1.equals(example3)); // TRIGGER BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
    }
}