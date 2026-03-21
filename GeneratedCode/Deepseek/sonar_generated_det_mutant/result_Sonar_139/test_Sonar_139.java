import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
        double result = Main.showBug();

        // This test should fail because showBug() is expected to return NaN
        // but it is returning a different value due to a bug.
        assertTrue(Double.isNaN(result));  // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
    }
}