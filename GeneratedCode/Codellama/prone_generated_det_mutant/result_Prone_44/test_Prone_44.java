import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsHashCodeBugTest {
    
    @Test
    public void testEqualsHashCodeBug() {
        EqualsHashCodeBug obj1 = new EqualsHashCodeBug(1, "Alice");
        EqualsHashCodeBug obj2 = new EqualsHashCodeBug(1, "Alice");

        assertEquals(obj1, obj2);
        assertTrue(obj1.hashCode() == obj2.hashCode());

        // TRIGGER BUG: EqualsHashCode
        assertFalse(obj1.hashCode() == obj2.hashCode());
    }
}