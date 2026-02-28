import org.junit.Test;
import static org.junit.Assert.*;

public class EqBugTest {

    @Test
    public void testEquals() {
        // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
        EqBug a = new EqBug(1, 2);
        EqBug b = new EqBug(1, 2);
        assertEquals(a, b);
    }

    @Test
    public void testEqualsWithNull() {
        // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
        EqBug a = new EqBug(1, 2);
        assertEquals(a, null);
    }

    @Test
    public void testEqualsWithDifferentClass() {
        // BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)
        EqBug a = new EqBug(1, 2);
        Object b = new Object();
        assertEquals(a, b);
    }
}