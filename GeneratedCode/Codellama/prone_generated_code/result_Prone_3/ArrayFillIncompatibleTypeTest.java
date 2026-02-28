import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayFillIncompatibleTypeTest {
    @Test
    public void testBug() {
        String[] stringArray = new String[42];
        try {
            Arrays.fill(stringArray, 42);
            fail("Expected ArrayStoreException to be thrown");
        } catch (ArrayStoreException e) {
            assertEquals("java.lang.Integer cannot be stored in an array of type java.lang.String[]", e.getMessage());
        }
    }
}