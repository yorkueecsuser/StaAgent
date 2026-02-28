import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullTest {
    @Test
    public void testEqualsNull() {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
        // TRIGGER BUG: EqualsNull
        assertTrue(obj.equals(null));
    }

    @Test
    public void testEqualsNullWithNullObject() {
        Object obj = null;
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
        // TRIGGER BUG: EqualsNull
        assertTrue(obj.equals(null));
    }
}