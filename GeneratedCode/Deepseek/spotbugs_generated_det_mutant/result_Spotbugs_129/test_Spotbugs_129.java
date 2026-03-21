import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        int x = 8;
        int y = 2;
        int result = Main.showBug(x, y);
        // We expect the result to be x * (2 ^ 8) + y. 
        // But due to precedence of shift operation, it is actually x << (8 + y), which is a bug.
        int expected = x * (2 ^ 8) + y;
        // Therefore, we expect the result to be different from the expected result.
        assertNotEquals("Bug not triggered as expected", expected, result); // TRIGGER BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}