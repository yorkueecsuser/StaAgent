import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testEquals() {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // TRIGGER BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        boolean result = str.equals(num);

        // This test case should fail because the equals method of String is not designed to compare with Integer objects.
        assertFalse(result);
    }
}