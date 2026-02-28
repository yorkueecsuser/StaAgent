import org.junit.Test;
import static org.junit.Assert.*;

class EqualsBugTest {
    @Test
    public void testEqualsBug() {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        assertNotEquals(bug1, bug2); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testEqualsBug2() {
        EqualsBug bug1 = new EqualsBug(1, 2);
        Object bug2 = new Object();
        assertNotEquals(bug1, bug2); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }
}