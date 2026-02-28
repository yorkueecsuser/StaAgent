import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

class BuggyTernaryTest {
    @Test
    public void testBug() {
        int x = 10;
        Integer y = 20;
        Float z = 30f;

        // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Float result = x > y? z : y;

        assertEquals(result, z);
    }

    @Test
    public void testShowBug() {
        int x = 10;
        Integer y = 20;
        Float z = 30f;

        // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Float result = BuggyTernary.showBug(x, y, z);

        assertEquals(result, z);
    }
}