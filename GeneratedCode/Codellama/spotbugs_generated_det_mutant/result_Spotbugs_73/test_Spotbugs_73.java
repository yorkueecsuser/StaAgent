import org.junit.Test;
import static org.junit.Assert.*;

class UnrelatedTypesEqualsBugTest {

    @Test
    public void testBug() {
        String s = "Hello";
        Integer i = 5;

        // TRIGGER BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        assertFalse(s.equals(i));

        // TRIGGER BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        assertTrue(i.equals(s));
    }
}