import org.junit.Test;
import static org.junit.Assert.*;

public class CompareObjectsWithEqualsTest {
    CompareObjectsWithEquals obj = new CompareObjectsWithEquals();

    @Test
    public void testEqualsTest() {
        String a = new String("Hello");
        String b = new String("Hello");
        assertFalse(obj.equalsTest(a, b)); // TRIGGER BUG: CompareObjectsWithEquals
    }
}