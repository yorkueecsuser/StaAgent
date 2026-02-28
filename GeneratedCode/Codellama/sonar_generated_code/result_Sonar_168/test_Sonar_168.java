import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsHashCodeBugTest {
    @Test
    public void testEqualsHashCodeBug() {
        EqualsHashCodeBug obj1 = new EqualsHashCodeBug(1, 2);
        EqualsHashCodeBug obj2 = new EqualsHashCodeBug(1, 3);
        assertEquals(obj1.hashCode(), obj2.hashCode()); // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    }
}