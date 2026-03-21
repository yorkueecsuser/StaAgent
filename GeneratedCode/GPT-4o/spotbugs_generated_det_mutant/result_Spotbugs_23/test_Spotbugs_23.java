import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysTrueEqualsTest {

    @Test
    public void testEqualsMethod() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Object1", 1);
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Object2", 2);

        // This should fail because obj1 and obj2 have different names and ids
        assertFalse(obj1.showBug(obj2)); // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    @Test
    public void testSymmetry() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Object1", 1);
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Object2", 2);

        // This should fail because equals method is not symmetric due to always returning true
        assertTrue(obj1.showBug(obj2) == obj2.showBug(obj1)); // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    @Test
    public void testReflexivity() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Object1", 1);

        // This is expected to pass because an object should be equal to itself
        assertTrue(obj1.showBug(obj1));
    }

    @Test
    public void testTransitivity() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Object1", 1);
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Object2", 2);
        AlwaysTrueEquals obj3 = new AlwaysTrueEquals("Object3", 3);

        // This should fail because the transitive property is violated
        assertTrue(obj1.showBug(obj2) && obj2.showBug(obj3) && obj1.showBug(obj3)); // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }
}